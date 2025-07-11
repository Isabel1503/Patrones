package co.edu.udistrital.model;

public class ReunionModelos extends Reunion{

	public ReunionModelos(IPlataforma plataforma) {
		super(plataforma);
	}

	@Override
	public void Programar(String fecha) {
		plataforma.programar( fecha);
		
	}

}
