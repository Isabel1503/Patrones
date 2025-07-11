package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.List;

public class Bosque {
	private List<Arbol> arboles = new ArrayList<>();

	//Método que usa la fabrica para compartir tipos y planta arboles con diferentes coordenadas
    public void plantar(int x, int y, String nombre, String color, String textura) {
        TipoArbol tipo = FabricaTipoArbol.obtenerTipo(nombre, color, textura);
        Arbol arbol = new Arbol(x, y, tipo);
        arboles.add(arbol);
    }

    //Este método muestra los tipos y la cantidad de arboles plantados
    public String mostrarTodos() {
    	StringBuilder sb = new StringBuilder();

        for (Arbol a : arboles) {
            sb.append(a.mostrar()).append("\n");
        }

        sb.append("Total de tipos únicos de árbol: ")
          .append(FabricaTipoArbol.totalTipos())
          .append("\nTotal de árboles plantados: ")
          .append(arboles.size());

        return sb.toString();
    }

}
