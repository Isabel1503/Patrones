package co.edu.udistrital.model;

public class Moto {
	private int id;
	private String marca;
	private String tipo;
	private int referencia;
	private int cilindraje;
	
	//Constructor que inicializa el id
	public Moto(int id) {
		this.id = id;
		
	}
	//Método estático que retorna un nuevo objeto Builder para construir una Moto
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	// Clase interna estática Builder para aplicar el patrón de diseño Builder
	public static class Builder{
		
		// Referencia interna a la Moto que se está construyendo
		private Moto moto;
		
		// Constructor privado que inicializa una nueva Moto con el id
		private Builder(int id) {
			this.moto =new Moto(id);
		}
		
		// Métodos para configurar los atributos de la Moto
				// Cada método retorna el mismo objeto Builder para permitir encadenamiento
		public Builder marca(String marca) {
			this.moto.marca = marca;
			return this;
		}
		
		public Builder tipo(String tipo) {
			this.moto.tipo = tipo;
			return this;
		}
		
		public Builder referencia(int referencia) {
			this.moto.referencia = referencia;
			return this;
		}
		
		public Builder cilindraje (int cilindraje) {
			this.moto.cilindraje = cilindraje;
			return this;
		}
		
		// Método final que retorna la instancia de Moto ya configurada
		public Moto build() {
			return this.moto;
		}
		
		
	}
	
	

}
