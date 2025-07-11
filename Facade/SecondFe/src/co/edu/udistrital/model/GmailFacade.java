package co.edu.udistrital.model;

//Clase fachada que coordina todos los subsistemas

public class GmailFacade {
    private Verificacion verificacion;
    private CambioContrasena cambioC;
    private Notificador notificador;

    public GmailFacade() {
        verificacion = new Verificacion();
        cambioC = new CambioContrasena();
        notificador = new Notificador();
    }
    
 // Método único de la fachada que ejecuta toda la lógica del cambio de contraseña
    public String cambioContrasena(String contrasena, String contrasenaN) {
        StringBuilder resultado = new StringBuilder();
        resultado.append(" Iniciando proceso de cambio de contraseña\n");

        resultado.append(verificacion.mensajeVerificacion(contrasena)).append("\n");
        if (!verificacion.verificarProducto(contrasena)) {
            resultado.append(" Contraseña invalida.\n");
            return resultado.toString();
        }

        resultado.append(cambioC.cambiarContraseña(contrasena)).append("\n");
        resultado.append(notificador.enviarConfirmacion(contrasena)).append("\n");
        resultado.append("CAmbio de contraseña exitosa.\n");

        return resultado.toString();
    }
}

