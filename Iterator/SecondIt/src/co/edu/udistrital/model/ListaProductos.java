package co.edu.udistrital.model;

public class ListaProductos implements Coleccion {
	private String[] nombres;

    public ListaProductos(String[] nombres) {
        this.nombres = nombres;
    }

	@Override
	public Iterador crearIterador() {
		// TODO Auto-generated method stub
		return new ProductoIterador(nombres);
	}

}
