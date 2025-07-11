package co.edu.udistrital.model;

//Clase fachada que coordina todos los subsistemas

public class NequiFacade {
    private Almacenamiento almacenamiento;
    private Pago pago;
    private Notificador notificador;

    public NequiFacade() {
    	almacenamiento = new Almacenamiento();
        pago = new Pago();
        notificador = new Notificador();
    }
    
 // Método único de la fachada que ejecuta toda la lógica de pago de recibo
    public String pagarCuenta(String cuenta, double monto) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(" Iniciando proceso de busqueda\n");

        resultado.append(almacenamiento.mensajeVerificacion(cuenta)).append("\n");
        if (!almacenamiento.verificarCuenta(cuenta)) {
            resultado.append(" Cuenta no encontrada.\n");
            return resultado.toString();
        }

        resultado.append(pago.procesarPago(monto)).append("\n");
        resultado.append(notificador.enviarConfirmacion(cuenta)).append("\n");
        resultado.append("Pago exitoso .\n");

        return resultado.toString();
    }
}

