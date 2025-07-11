package co.edu.udistrital.controller;

import co.edu.udistrital.model.CuidadorJuego;
import co.edu.udistrital.model.EstadoJuego;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private EstadoJuego juego;
	private CuidadorJuego memoria;
	
	public Controller() {
		vista = new VistaConsola();
		juego = new EstadoJuego();
		memoria = new CuidadorJuego();
	}
	
	public void run() {
		juego.jugarNivel(1, 3);
	    vista.mostrarInformacion(juego.mostrar()+"\n");
	    memoria.guardar(juego.guardar());// Datos guardados antes de la batalla
	
	    juego.jugarNivel(2, 1); // pierde vidas
        vista.mostrarInformacion(juego.mostrar()+"\n");
        
        vista.mostrarInformacion("Reiniciar juego..\n");
        juego.cargar(memoria.cargar());
        vista.mostrarInformacion(juego.mostrar());;
	}
	

}
