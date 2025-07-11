package co.edu.udistrital.model;

public class ComputadorUnico {
	
	private static ComputadorUnico instancia=null;
	private String PruebaInstancia = null;
	
	private ComputadorUnico() {}
	
	public static ComputadorUnico getinstancia() {
		
		if(instancia== null) {
		instancia = new ComputadorUnico();
		}
		return instancia;
	}
	
	public void referencia(String refe) {
		System.out.println(refe);
	}
	
	public void setPruebaInstancia(String salida) {
		PruebaInstancia = salida;
	}
	
	public String getPruebaInstancia() {
		return PruebaInstancia;
	}

}
