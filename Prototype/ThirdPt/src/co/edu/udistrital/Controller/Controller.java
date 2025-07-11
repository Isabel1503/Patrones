package co.edu.udistrital.Controller;

import co.edu.udistrital.model.Curso;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	public Controller() {
		vista = new VistaConsola();
	}
	
	public void run() {
	Curso obj1 = new Curso("Modelos de programación","205454465");
	Curso obj2 = new Curso("Programación básica","205454468");
	vista.mostrarInformacion("El objeto 1 es: "+obj1.getNombre()+" "+obj1.getCodigo());
	vista.mostrarInformacion("El objeto 2 es: "+obj2.getNombre()+" "+obj2.getCodigo());
	
	obj1 = obj2;
	vista.mostrarInformacion("El objeto 1 es: "+obj1.getNombre()+" "+obj1.getCodigo());
	obj2.setNombre("Programación avanzada");
	vista.mostrarInformacion("El objeto 2 es: "+obj2.getNombre()+" "+obj2.getCodigo());
	vista.mostrarInformacion("El objeto 1 es: "+obj1.getNombre()+" "+obj1.getCodigo());
	
	}

}
