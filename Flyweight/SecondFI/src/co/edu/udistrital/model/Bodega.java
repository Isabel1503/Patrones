package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.List;

public class Bodega {
	private List<Carro> carros = new ArrayList<>();

	//Método que usa la fabrica para compartir tipos y planta arboles con diferentes coordenadas
    public void ubicar(int x, int y, String nombre, String color) {
        TipoCarro tipo = FabricaTipoCarro.obtenerTipo(nombre, color);
        Carro carro = new Carro(x, y, tipo);
        carros.add(carro);
    }

    //Este método muestra los tipos y la cantidad de arboles plantados
    public String mostrarTodos() {
    	StringBuilder sb = new StringBuilder();

        for (Carro a : carros) {
            sb.append(a.mostrar()).append("\n");
        }

        sb.append("Total de tipos únicos de carro: ")
          .append(FabricaTipoCarro.totalTipos())
          .append("\nTotal de carros ubicados: ")
          .append(carros.size());

        return sb.toString();
    
    }

}
