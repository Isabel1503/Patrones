package co.edu.udistrital.model;

//Clase Hoja
public class Opcion implements ElementoMenu{
	
	private String nombre;
	
	public Opcion(String nombre) {
		this.nombre = nombre;
	}

	//Método que muestra la opción con identación
	@Override
	public String mostrar(String identacion) {
		// TODO Auto-generated method stub
		return identacion+ nombre +"\n";
	}

	//Método que muestra el nombre de la opción
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
