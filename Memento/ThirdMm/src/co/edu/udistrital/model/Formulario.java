package co.edu.udistrital.model;

public class Formulario {
	private String nombre;
    private String email;

    public void setDatos(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public FormularioMemento guardar() {
        return new FormularioMemento(nombre, email);
    }

    public void restaurar(FormularioMemento m) {
        this.nombre = m.getNombre();
        this.email = m.getEmail();
    }

    public String mostrar() {
        return(" Nombre: " + nombre + " | Email: " + email);
    }

}
