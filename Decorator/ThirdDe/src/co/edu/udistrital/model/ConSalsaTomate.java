package co.edu.udistrital.model;

public class ConSalsaTomate extends ComidaRapidaDecorator{

	public ConSalsaTomate(ComidaRapida comidaR) {
		super(comidaR);
		// TODO Auto-generated constructor stub
	}

	//Métodos heredados de ComidaRapidaDecorator para adicionar ingrediente
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return comidaR.getDescripcion()+" con salsa de tomate";
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return comidaR.getCosto()+500;
	}

}
