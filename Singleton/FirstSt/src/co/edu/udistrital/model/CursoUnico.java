package co.edu.udistrital.model;

public class CursoUnico {
	
	private static CursoUnico instancia = null;
	private String PruebaInstancia = null;
	
	private CursoUnico() {
		
	}
	
	public static CursoUnico getinstancia() {
		if(instancia == null) {
			instancia = new CursoUnico();
		}
		return instancia;
	}
	
	public void codigo(String code) {
		System.out.println(code);
	}
	
	public void setPruebaInstancia(String salida) {
		PruebaInstancia = salida;
	}
	
	public String getPruebaInstancia() {
		return PruebaInstancia;
	}
	

}
