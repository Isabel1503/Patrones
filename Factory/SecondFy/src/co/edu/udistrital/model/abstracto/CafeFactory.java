package co.edu.udistrital.model.abstracto;

public interface CafeFactory {
	Cafe crearCafe(char tipo);
	double obtenerPrecio();
}
