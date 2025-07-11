package co.edu.udistrital.model;

public class Celular {
	private int id;
	private String marca;
	private int referencia;
	private String nfc;
	private int almacenamiento;
	private int ResolucionCa;
	private String OS;
	
	//Constructor que inicializa el id
	public Celular(int id) {
		this.id = id;
	}
	//Método estático que retorna un nuevo objeto Builder para construir un celular
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



	public int getReferencia() {
		return referencia;
	}



	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}



	public String getNfs() {
		return nfc;
	}



	public void setNfs(String nfs) {
		this.nfc = nfs;
	}



	public int getAlmacenamiento() {
		return almacenamiento;
	}



	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}



	public int getResolucionCa() {
		return ResolucionCa;
	}



	public void setResolucionCa(int resolucionCa) {
		ResolucionCa = resolucionCa;
	}



	public String getOS() {
		return OS;
	}



	public void setOS(String oS) {
		OS = oS;
	}



	


	// Clase interna estática Builder para aplicar el patrón de diseño Builder
	public static class Builder{
		
		// Referencia interna al celular que se está construyendo
		private Celular celular;
		
		// Constructor privado que inicializa un nuevo celular con el id
		private Builder(int id){
			this.celular = new Celular(id);
		}
		
		// Métodos para configurar los atributos de la Moto
		// Cada método retorna el mismo objeto Builder para permitir encadenamiento
		public Builder marca(String marca) {
			this.celular.marca = marca;
			return this;
		}
		
		public Builder referencia(int referencia) {
			this.celular.referencia = referencia;
			return this;
		}
		
		public Builder nfc(String nfc) {
			this.celular.nfc =nfc;
			return this;
		}
		
		
		public Builder almacenamiento(int almacenamiento) {
			this.celular.almacenamiento = almacenamiento;
			return this;
		}
		
		
		public Builder ResolucionCa(int ResolucionCa) {
			this.celular.ResolucionCa = ResolucionCa;
			return this;
		}
		
		public Builder OS(String OS) {
			this.celular.OS = OS;
			return this;
		}
		
		// Método final que retorna la instancia de Celular ya configurada
		public Celular build() {
			return this.celular;
		}
		
	}

}

