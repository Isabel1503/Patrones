package co.ed.udistrital.model.ConcretoCreador;

import co.edu.udistrital.model.Americano;
import co.edu.udistrital.model.Cappuccino;
import co.edu.udistrital.model.Latte;
import co.edu.udistrital.model.abstracto.Coffe;
import co.edu.udistrital.model.abstracto.CoffeFactory;

public class CoffeCreador implements CoffeFactory{

	@Override
	public Coffe CrearOrden(String tipo, int cantidad) {
		if (tipo == "Americano") {
			return new Americano(tipo,cantidad);
		}else if(tipo == "Latte"){
			return new Latte(tipo,cantidad);	
		}else {
			return new Cappuccino(tipo,cantidad);
		}
	}
}
