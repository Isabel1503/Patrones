package co.edu.udistrital.model;

public class FormularioMemento {
	private final String nombre;
    private final String email;

    public FormularioMemento(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
	

}
