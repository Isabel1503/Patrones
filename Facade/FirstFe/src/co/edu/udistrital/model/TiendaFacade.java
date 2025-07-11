package co.edu.udistrital.model;

//Clase fachada que coordina todos los subsistemas

public class TiendaFacade {
    private Inventario inventario;
    private Pago pago;
    private Notificador notificador;

    public TiendaFacade() {
        inventario = new Inventario();
        pago = new Pago();
        notificador = new Notificador();
    }
    
 // Método único de la fachada que ejecuta toda la lógica de compra
    public String comprarProducto(String producto, double monto) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(" Iniciando proceso de compra\n");

        resultado.append(inventario.mensajeVerificacion(producto)).append("\n");
        if (!inventario.verificarProducto(producto)) {
            resultado.append(" Producto no disponible.\n");
            return resultado.toString();
        }

        resultado.append(pago.procesarPago(monto)).append("\n");
        resultado.append(notificador.enviarConfirmacion(producto)).append("\n");
        resultado.append("Compra exitosa.\n");

        return resultado.toString();
    }
}

