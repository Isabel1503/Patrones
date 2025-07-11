package co.edu.udistrital.controller;

import co.edu.udistrital.model.abstracto.Jugador;
import co.edu.udistrital.model.abstracto.JugadorFactory;
import co.edu.udistrital.model.concretoCreator.JugadorCreador;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	
    public Controller() {
    	vista = new VistaConsola();
	}
    
    public void run() {
    	String a = "0";
    	int h =0;
    	
        vista.mostrarInformacion("Clasificación de jugador");
        
        a = vista.leerCadenaTexto("\t" + "Digite su Apodo: ");
        h = vista.leerDatoEntero("Ingrese el número de horas que ha jugado: ");
        
        JugadorFactory fabrica=new JugadorCreador();
        Jugador jugador = fabrica.crearTipoJugador(a, h);
        
        vista.mostrarInformacion("Su tipo de jugador es :" +jugador.describir());
        vista.mostrarInformacion(jugador.AsignarBonus());
        
        
        
       
    }

}
