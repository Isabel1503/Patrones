package co.edu.udistrital.model;

public class ConCanela extends BebidaDecorator{
	

	public ConCanela(Bebida bebida) {
		super(bebida);
		// TODO Auto-generated constructor stub
	}

	//Métodos heredados de SnckDecorator para adicionar ingrediente
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return bebida.getDescripcion() + " con canela";
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return bebida.getCosto()+400;
	}

}
