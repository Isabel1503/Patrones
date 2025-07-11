package co.edu.udistrital.model;

public abstract class Carro {
	
	public final String Construir() {
		StringBuilder sb = new StringBuilder();
		sb.append(ubicarChasis());
		sb.append(colocarLlantas());
		sb.append(ensablarmotor());
		sb.append(enviar());
		return sb.toString();
	}
	
	private Object ubicarChasis() {
		return "Ubicando el chasis en el soporte correspondiente\n";
	}
	
	private Object colocarLlantas() {
		return "Colocando llantas\n";
		}
	
	protected abstract Object ensablarmotor();
	
	private Object enviar() {
		return "Enviando al siguiente proceso\n";
	
	}

}
