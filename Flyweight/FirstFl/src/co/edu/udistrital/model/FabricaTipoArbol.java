package co.edu.udistrital.model;

import java.util.HashMap;
import java.util.Map;

public class FabricaTipoArbol {
	private static final Map<String, TipoArbol> tipos = new HashMap<>();

	//Este método reutiliza un arbol si este ya existe
    public static TipoArbol obtenerTipo(String nombre, String color, String textura) {
        String clave = nombre + "-" + color + "-" + textura;

        if (!tipos.containsKey(clave)) {
            tipos.put(clave, new TipoArbolConcreto(nombre, color, textura));
        }

        return tipos.get(clave);
    }

    public static int totalTipos() {
        return tipos.size();
    }

}
