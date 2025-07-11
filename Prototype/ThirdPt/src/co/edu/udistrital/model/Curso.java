package co.edu.udistrital.model;

public class Curso {
	private String nombre;
	private String codigo;
	
	public Curso(String Nombre , String Codigo) {
		this.nombre = Nombre;
		this.codigo = Codigo;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	

}
