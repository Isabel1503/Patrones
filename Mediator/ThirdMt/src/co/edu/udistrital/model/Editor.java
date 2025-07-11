package co.edu.udistrital.model;

public abstract class Editor {
	protected MuroMediator mediator;
    protected String nombre;

    public Editor(MuroMediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
    
    public String getNombre() {
        return nombre;
    }

}
