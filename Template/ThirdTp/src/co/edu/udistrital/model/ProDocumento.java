package co.edu.udistrital.model;

public abstract class ProDocumento {
	
	public final String procesar() {
		StringBuilder sb = new StringBuilder();
		sb.append(abrirDocumento());
		sb.append(leerContenido());
		sb.append(procesarContenido());
		sb.append(guardarDocumento());
		return sb.toString();
		
	}


	private String abrirDocumento() {
		return "Abriendo documento....\n";
		
	}
	private Object leerContenido() {
		return "Leyendo documento\n";
	}
	protected abstract Object procesarContenido();
	
	private Object guardarDocumento() {
		return "Guardando documento....\n";
	}
	
}
