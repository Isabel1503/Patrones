package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.List;

public class Entorno {
	private List<Personaje> personajes = new ArrayList<>();

	//Método que usa la fabrica para compartir tipos y planta arboles con diferentes coordenadas
    public void ubicar(int x, int y, String nombre, String color) {
        TipoPersonaje tipo = FabricaTipoPersonaje.obtenerTipo(nombre, color);
        Personaje carro = new Personaje(x, y, tipo);
        personajes.add(carro);
    }

    //Este método muestra los tipos y la cantidad de arboles plantados
    public String mostrarTodos() {
    	StringBuilder sb = new StringBuilder();

        for (Personaje a : personajes) {
            sb.append(a.mostrar()).append("\n");
        }

        sb.append("Total de tipos únicos de personaje: ")
          .append(FabricaTipoPersonaje.totalTipos())
          .append("\nTotal de carros ubicados: ")
          .append(personajes.size());

        return sb.toString();
    
    }

}
