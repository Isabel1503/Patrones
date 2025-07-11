package co.edu.udistrital.model;

import java.util.HashMap;
import java.util.Map;

public class FabricaTipoCarro{
	private static final Map<String, TipoCarro> tipos = new HashMap<>();

	//Este método reutiliza un arbol si este ya existe
    public static TipoCarro obtenerTipo(String nombre, String color) {
        String clave = nombre + "-" + color ;

        if (!tipos.containsKey(clave)) {
            tipos.put(clave, new TipoCarroConcreto(nombre, color));
        }

        return tipos.get(clave);
    }

    public static int totalTipos() {
        return tipos.size();
    }

}
