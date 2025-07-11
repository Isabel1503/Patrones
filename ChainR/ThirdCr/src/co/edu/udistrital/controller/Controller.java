package co.edu.udistrital.controller;

import co.edu.udistrital.model.ProblemaManejador;
import co.edu.udistrital.model.Tecnico;
import co.edu.udistrital.model.Empleado;
import co.edu.udistrital.model.Soporte;
import co.edu.udistrital.model.SolicitudProblema;
import co.edu.udistrital.view.VistaConsola;


public class Controller {
    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
 
        int escala = vista.leerDatoEntero("Ingrese el grado de su falla:\n" +
        	    "1. Leve \n" +
        	    "2. Media \n" +
        	    "3. Grave \n" +
        	    "Seleccione una opción: ");
        SolicitudProblema solicitud = new SolicitudProblema(escala);

        // Crear manejadores
        ProblemaManejador empleado = new Empleado();
        ProblemaManejador soporte = new Soporte();
        ProblemaManejador tecnico = new Tecnico();

        // Cadena: empleado → soporte → técnico
        empleado.setSiguienteManejador(soporte);
        soporte.setSiguienteManejador(tecnico);

        // Ejecutar la cadena
        String resultado = empleado.procesarSolicitud(solicitud);
        vista.mostrarInformacion(resultado);
    }
}

