package co.edu.udistrital.model;

public class BebidaIterador implements Iterador {
	
	private String[] nombres;
    private int posicion = 0;

    public BebidaIterador(String[] nombres) {
        this.nombres = nombres;
    }

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return posicion < nombres.length;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return nombres[posicion++];
	}

}
