package co.edu.udistrital.controller;

import co.edu.udisrital.view.VistaConsola;
import co.edu.udistrital.model.Documento;
import co.edu.udistrital.model.ProxyDocumento;

public class Controller {
	private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        vista.mostrarInformacion("Acceso al Documento Protegido");

        String usuario = vista.leerCadena("Ingrese su rol (admin/usuario): ");

        Documento documento = new ProxyDocumento(usuario);
        String resultado = documento.mostrarContenido();

        vista.mostrarInformacion(resultado);
    }
	

}
