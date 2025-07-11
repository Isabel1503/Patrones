package co.edu.udistrital.model;

public abstract class Reunion {
	IPlataforma plataforma;
	
	public Reunion(IPlataforma plataforma) {
		this.plataforma = plataforma;
	}
	
	public abstract void Programar(String fecha);
	
	

}
