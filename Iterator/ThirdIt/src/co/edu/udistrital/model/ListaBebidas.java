package co.edu.udistrital.model;

public class ListaBebidas implements Coleccion {
	private String[] nombres;

    public ListaBebidas(String[] nombres) {
        this.nombres = nombres;
    }

	@Override
	public Iterador crearIterador() {
		// TODO Auto-generated method stub
		return new BebidaIterador(nombres);
	}

}
