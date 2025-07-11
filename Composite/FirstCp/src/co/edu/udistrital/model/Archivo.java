package co.edu.udistrital.model;

//Clase Hoja
public class Archivo implements Elemento {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre = nombre;
	}

	//Método que muestra el archivo
	@Override
	public String mostrar(String referencia) {
		return referencia + nombre +"\n";
		
	}

	//Método que muestra el nombre del archivo
	@Override
	public String getNombre() {
		return nombre;
	}
	

}
