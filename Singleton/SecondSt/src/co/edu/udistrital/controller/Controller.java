package co.edu.udistrital.controller;

import co.edu.udistrital.model.ComputadorUnico;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
	public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	
    	ComputadorUnico  obj= ComputadorUnico.getinstancia();
        ComputadorUnico otra = ComputadorUnico.getinstancia();
        obj.setPruebaInstancia("ACER 001");
        vista.mostrarInformacion(otra.getPruebaInstancia());
        vista.mostrarInformacion(obj.getPruebaInstancia());
        otra.setPruebaInstancia("HP 001");
        vista.mostrarInformacion(obj.getPruebaInstancia());
        vista.mostrarInformacion(otra.getPruebaInstancia());
       
            
            
    }

}
