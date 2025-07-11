package co.edu.udistrital.model;

public class ListaNombres implements Coleccion {
	private String[] nombres;

    public ListaNombres(String[] nombres) {
        this.nombres = nombres;
    }

	@Override
	public Iterador crearIterador() {
		// TODO Auto-generated method stub
		return new NombreIterador(nombres);
	}

}
