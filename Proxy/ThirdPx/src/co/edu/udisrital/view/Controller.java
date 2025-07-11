package co.edu.udisrital.view;

import co.edu.udistrital.controller.Serie;
import co.edu.udistrital.controller.ProxySerie;
import co.edu.udistrital.model.VistaConsola;

public class Controller {
	private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        vista.mostrarInformacion("Sistema de series");

        String nombre = vista.leerCadena("Ingrese el nombre de la serie que desea ver: ");
        String tipo = vista.leerCadena("¿Tiene membresia? (si/no): ");

        boolean membresia = tipo.equalsIgnoreCase("si");

        Serie video = new ProxySerie(nombre, membresia);
        vista.mostrarInformacion(video.ver());
    }
	

}
