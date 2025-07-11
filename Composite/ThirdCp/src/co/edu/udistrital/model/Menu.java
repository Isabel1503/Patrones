package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.List;

//Clase Compuesta
public class Menu implements ElementoMenu {
	private String nombre;
	//contiene una lista de elementos
	private List<ElementoMenu> elementos= new ArrayList<>();

	public Menu(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregar(ElementoMenu e) {
		elementos.add(e);
	}
	
	//Método que muestra al menú y sus submenús
	@Override
	public String mostrar(String identacion) {
		StringBuilder resultado = new StringBuilder();
        resultado.append(identacion).append(" ").append(nombre).append("\n");
        for (ElementoMenu e : elementos) {
            resultado.append(e.mostrar(identacion+ "   "));
        }
		return resultado.toString();
	}

	//Método que obtiene el nombre del menu
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
