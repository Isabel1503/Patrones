package co.edu.udistrital.model;

public class ConLeche extends BebidaDecorator{

	public ConLeche(Bebida bebida) {
		super(bebida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return bebida.getDescripcion()+" con leche";
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return bebida.getCosto()+500;
	}

}
