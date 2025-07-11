package co.edu.udistrital.controller;

import co.edu.udistrital.model.Formulario;
import co.edu.udistrital.model.FormularioHistorial;
import co.edu.udistrital.model.FormularioMemento;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private Formulario formulario;
	private FormularioHistorial historial;
	
	public Controller() {
		vista = new VistaConsola();
		formulario = new Formulario();
		historial = new FormularioHistorial();
		
	}
	
	public void run() {
		int opcion = 0;
		String nombre = null;
		String email = null;
		
		while(true) {
			opcion = vista.leerDatoEntero("\n[1] Editar\n[2] Deshacer\n[3] Mostrar\n[0] Salir");
			
			switch(opcion) {
			case 1:
				nombre = vista.leerCadena("Nombre: ");
				email = vista.leerCadena("Email: ");
				historial.guardar(formulario.guardar());
				formulario.setDatos(nombre, email);
				break;
			case 2:
				FormularioMemento f = historial.deshacer();
                if (f != null) {
                    formulario.restaurar(f);
                    vista.mostrarInformacion("Cambios revertidos");
                } else {
                    vista.mostrarInformacion(" No hay historial.");
                }
                break;
			case 3:
				vista.mostrarInformacion(formulario.mostrar());
                break;
			case 0:
				return;
			default:
				vista.mostrarInformacion("Opción no valida");
				
				
			}
		}
	}

}
