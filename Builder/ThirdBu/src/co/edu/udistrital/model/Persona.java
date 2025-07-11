package co.edu.udistrital.model;

public class Persona {
	private int id;
	private String nombre;
	private int documento;
	private String correo;
	
	//Constructor que inicializa el id
	public Persona(int id) {
		this.id = id;
	}
	
	//Método estático que retorna un nuevo objeto Builder(Que es una clase interna) para construir una Persona
	public static Builder builder(int id) {
		return new Builder(id);	
	}
	
	//Getters y setters para acceder y modificar los atributos
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	// Clase interna estática Builder para aplicar el patrón de diseño Builder
	public static class Builder{
		
		// Referencia interna a la Persona que se está construyendo
		private Persona persona;
		
		// Constructor privado que inicializa una nueva Persona con el id
		private Builder(int id) {
			this.persona =new Persona(id);
		}
		
		//Métodos para configurar los atributos de la Persona
		// Cada método retorna el mismo objeto Builder para permitir encadenamiento
		public Builder nombre(String nombre) {
			this.persona.nombre = nombre;
			return this;
		}
		
		public Builder documento(int documento) {
			this.persona.documento = documento;
			return this;
		}
		
		public Builder correo (String correo) {
			this.persona.correo = correo;
			return this;
		}
		
		// Método final que retorna la instancia de Persona ya configurada
		public Persona build() {
			return this.persona;
		}
		
		
	}
	
	
	
	

}
