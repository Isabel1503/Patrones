package co.edu.udistrital.model;

public abstract class Bebida {
	
	public final String preparar() {
		StringBuilder sb = new StringBuilder(); //Crea un contenedor de texto
		sb.append(hervirAgua());//Paso 1: Hervir agua
		sb.append(agregarIngrediente()); // Paso 2: Agregar ingrediente 
		sb.append(servir()); //Paso 3: Servir
		return sb.toString(); // Devuelve todo como un solo String
		}
	
	//Método común para todas las clases
	private String hervirAgua() {
		return "Hirviendo agua\n ";
	}
	
	//Método abstracto el cual se define en cada clase concreta
	protected abstract Object agregarIngrediente();
	
	//Método común para todas las clases
	private Object servir() {
		return "Sirviendo\n";
	}
	
	
	
}


