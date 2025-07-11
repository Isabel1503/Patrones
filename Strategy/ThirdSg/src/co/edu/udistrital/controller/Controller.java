package co.edu.udistrital.controller;


import co.edu.udistrital.model.Producto;
import co.edu.udistrital.model.concreto.Diamante;
import co.edu.udistrital.model.concreto.Potencial;
import co.edu.udistrital.view.VistaConsola;

public class Controller {
	private VistaConsola vista;
	private Producto producto;

	
	public Controller(){
		vista = new VistaConsola();
		producto = new Producto();
		
		
	}
	
	 //Método de ejecución 
    public void run() {
        int opcion = menu();  

        if (opcion == 1 || opcion == 2) {
            double montoB = vista.leerDatoEntero("Ingrese el precio del producto: ");
            
            if (opcion == 1) {
                producto.setDescuento(new Potencial());
            } else {
                producto.setDescuento(new Diamante());
            }

            double mensaje = producto.calcularMonto(montoB);
            vista.mostrarInformacion( "Total a pagar: " + mensaje);
        } else if (opcion == 3) {
            vista.mostrarInformacion("Cerrando programa...");
        } else {
            vista.mostrarInformacion("Opción inválida.");
        }
    }

    //Método que muestra el ménu
    public int menu() {
        String menu = 
                "\nMENU DE OPCIONES\n"
                + "1. POTENCIAL\n"
                + "2. DIAMANTE\n"
                + "3. CANCELAR PAGO\n"
                + "Seleccione el tipo de descuento : ";
        return vista.leerDatoEntero(menu);
    }

}
