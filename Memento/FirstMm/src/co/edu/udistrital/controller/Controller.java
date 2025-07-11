package co.edu.udistrital.controller;

import co.edu.udistrital.model.EditorTexto;
import co.edu.udistrital.model.Historial;
import co.edu.udistrital.view.VistaConsola;

public class Controller{
    private EditorTexto editor;
    private Historial historial;
    private VistaConsola vista;

    public Controller() {
        editor = new EditorTexto();
        historial = new Historial();
        vista = new VistaConsola();
    }

    public void run() {
        vista.mostrarInformacion("=== Editor de Texto (con Undo) ===");

        boolean continuar = true;
        while (continuar) {
            vista.mostrarInformacion(" Texto actual: " + editor.mostrar());

            String opcion = vista.leerCadena("Seleccione opción (escribir / deshacer / salir" );

            switch (opcion) {
                case "escribir":
                    historial.guardar(editor.guardar()); // guarda antes de escribir
                    String nuevoTexto = vista.leerCadena("Ingrese nuevo texto: ");
                    editor.escribir(nuevoTexto);
                    break;

                case "deshacer":
                    if (historial.hayHistorial()) {
                        editor.restaurar(historial.deshacer());
                        vista.mostrarInformacion("Deshacer realizado");
                    } else {
                        vista.mostrarInformacion(opcion);
                    }
                    break;

                case "salir":
                    continuar = false;
                    break;

                default:
                    vista.mostrarInformacion(opcion);
            }
        }

        vista.mostrarInformacion(" Programa finalizado.");
    }
}

