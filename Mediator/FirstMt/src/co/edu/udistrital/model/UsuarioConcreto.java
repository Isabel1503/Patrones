package co.edu.udistrital.model;

public class UsuarioConcreto extends Usuario{

	public UsuarioConcreto(ChatMediator mediator, String nombre) {
		super(mediator, nombre);
		// TODO Auto-generated constructor stub
	}

	 @Override
	    public void enviar(String mensaje) {
	        System.out.println(nombre + " dice: " + mensaje);
	        mediator.enviarMensaje(nombre + ": " + mensaje, this);
	    }

	    @Override
	    public void recibir(String mensaje) {
	        System.out.println( nombre + " recibió -> " + mensaje);
	    }
}
