package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.List;

//Clase Compuesta
public class Jefe implements ElementoEmpresa {
	private String nombre;
	//contiene una lista de elementos(jefes o empleados)
	private List<ElementoEmpresa> subordinados = new ArrayList<>();

	public Jefe(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregar(ElementoEmpresa e) {
		subordinados.add(e);
	}
	
	//Método que muestra al jefe y sus subordinados
	@Override
	public String mostrar(String identacion) {
		StringBuilder resultado = new StringBuilder();
        resultado.append(identacion).append(" Jefe: ").append(nombre).append("\n");
        for (ElementoEmpresa e : subordinados) {
            resultado.append(e.mostrar(identacion+ "   "));
        }
		return resultado.toString();
	}

	//Método que obtiene el nombre del jefe 
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

}
