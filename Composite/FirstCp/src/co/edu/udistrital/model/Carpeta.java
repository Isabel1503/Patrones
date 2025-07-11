package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.List;

public class Carpeta implements Elemento {

	private String nombre;
	//contiene una lista de elementos(archivos o carpetas)
	private List<Elemento> elementos = new ArrayList<>();
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
	}
	
	//Método que representa la carpeta, las subcarpetas y los archivos
	@Override
	public String mostrar(String referencia) {
		StringBuilder resultado = new StringBuilder();
		resultado.append(referencia).append(nombre).append("\n");
		
		for(Elemento e : elementos) {
            resultado.append(e.mostrar(referencia + "   "));
        }
		return resultado.toString();
	}
	
	//Método que agrega una nueva carpeta
	public void agregar(Elemento e) {
        elementos.add(e);
    }

	//Método que obtiene el nombre una nueva carpeta
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre ;
	}

}
