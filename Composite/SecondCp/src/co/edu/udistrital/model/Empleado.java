package co.edu.udistrital.model;

//Clase Hoja
public class Empleado implements ElementoEmpresa{
	
	private String nombre;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	//Método que muestra la jerarquia
	@Override
	public String mostrar(String identacion) {
		// TODO Auto-generated method stub
		return identacion+ nombre +"\n";
	}

	//Método que muestra el nombre de la persona
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
