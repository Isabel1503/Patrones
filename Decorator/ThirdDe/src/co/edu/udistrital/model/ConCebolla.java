package co.edu.udistrital.model;

public class ConCebolla extends ComidaRapidaDecorator{

	public ConCebolla(ComidaRapida comidaR) {
		super(comidaR);
		// TODO Auto-generated constructor stub
	}

	//Métodos heredados de ComidaRapidaDecorator para adicionar ingrediente
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return comidaR.getDescripcion() + " con cebolla";
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return comidaR.getCosto()+400;
	}

}
