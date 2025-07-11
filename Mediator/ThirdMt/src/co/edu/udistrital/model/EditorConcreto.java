package co.edu.udistrital.model;

public class EditorConcreto extends Editor{

	public EditorConcreto(MuroMediator mediator, String nombre) {
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
