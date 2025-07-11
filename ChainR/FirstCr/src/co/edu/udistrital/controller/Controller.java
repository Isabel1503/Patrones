package co.edu.udistrital.controller;

import co.edu.udistrital.model.CompraManejador;
import co.edu.udistrital.model.Director;
import co.edu.udistrital.model.Empleado;
import co.edu.udistrital.model.Gerente;
import co.edu.udistrital.model.SolicitudCompra;
import co.edu.udistrital.view.VistaConsola;


public class Controller {
    private VistaConsola vista;

    public Controller() {
        vista = new VistaConsola();
    }

    public void run() {
        vista.mostrarInformacion("🛒 Sistema de aprobación de compras");

        double monto = vista.leeDatorDecimal("Ingrese el monto de la compra: ");
        SolicitudCompra solicitud = new SolicitudCompra(monto);

        // Crear manejadores
        CompraManejador jefe = new Empleado();
        CompraManejador gerente = new Gerente();
        CompraManejador director = new Director();

        // Cadena: Jefe → Gerente → Director
        jefe.setSiguienteManejador(gerente);
        gerente.setSiguienteManejador(director);

        // Ejecutar la cadena
        String resultado = jefe.procesarSolicitud(solicitud);
        vista.mostrarInformacion(resultado);
    }
}

