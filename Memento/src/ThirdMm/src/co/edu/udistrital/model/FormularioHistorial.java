package co.edu.udistrital.model;

import java.util.Stack;

public class FormularioHistorial {
	private Stack<FormularioMemento> historial = new Stack<>();

    public void guardar(FormularioMemento f) {
        historial.push(f);
    }

    public FormularioMemento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }

}
