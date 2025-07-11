package co.edu.udistrital.model;

public abstract class Usuario {
	protected ForoMediator mediator;
    protected String nombre;

    public Usuario(ForoMediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
    
    public String getNombre() {
        return nombre;
    }

}
