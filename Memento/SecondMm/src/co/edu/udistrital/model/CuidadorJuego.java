package co.edu.udistrital.model;

public class CuidadorJuego {
	private GuardadorJuego save;

    public void guardar(GuardadorJuego save) {
        this.save = save;
    }

    public GuardadorJuego cargar() {
        return save;
    }

}
