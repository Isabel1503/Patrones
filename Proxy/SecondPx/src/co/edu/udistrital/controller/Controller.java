package co.edu.udistrital.controller;

import co.edu.udisrital.view.VistaConsola;
import co.edu.udistrital.model.ProxyVideo;
import co.edu.udistrital.model.Video;

public class Controller {
	private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        vista.mostrarInformacion("Sistema de descargas");

        String nombre = vista.leerCadena("Ingrese el nombre del video: ");
        String tipo = vista.leerCadena("¿Es usted usuario premium? (si/no): ");

        boolean esPremium = tipo.equalsIgnoreCase("si");

        Video video = new ProxyVideo(nombre, esPremium);
        vista.mostrarInformacion(video.descargar());
    }
	

}
