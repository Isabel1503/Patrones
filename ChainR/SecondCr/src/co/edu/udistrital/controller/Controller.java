package co.edu.udistrital.controller;

import co.edu.udistrital.model.PrestamoManejador;
import co.edu.udistrital.model.Director;
import co.edu.udistrital.model.Empleado;
import co.edu.udistrital.model.Gerente;
import co.edu.udistrital.model.SolicitudPrestamo;
import co.edu.udistrital.view.VistaConsola;


public class Controller {
    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        vista.mostrarInformacion("Sistema de Desembolso de crédito");

        double monto = vista.leeDatorDecimal("Ingrese el monto que desea solicitar: ");
        SolicitudPrestamo solicitud = new SolicitudPrestamo(monto);

        // Crear manejadores
        PrestamoManejador jefe = new Empleado();
        PrestamoManejador gerente = new Gerente();
        PrestamoManejador director = new Director();

        // Cadena: Jefe → Gerente → Director
        jefe.setSiguienteManejador(gerente);
        gerente.setSiguienteManejador(director);

        // Ejecutar la cadena
        String resultado = jefe.procesarSolicitud(solicitud);
        vista.mostrarInformacion(resultado);
    }
}

