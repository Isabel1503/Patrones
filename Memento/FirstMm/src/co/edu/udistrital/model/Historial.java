package co.edu.udistrital.model;

import java.util.Stack;

public class Historial {
	private Stack<Memento> historial = new Stack<>();

    public void guardar(Memento m) {
        historial.push(m);
    }

    public Memento deshacer() {
        if (!historial.isEmpty()) {
            return historial.pop();
        }
        return null;
    }
    
    public boolean hayHistorial() {
        return !historial.isEmpty();
    }

}
