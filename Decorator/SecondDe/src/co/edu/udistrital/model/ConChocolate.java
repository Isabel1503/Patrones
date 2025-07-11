package co.edu.udistrital.model;

public class ConChocolate extends SnackDecorator{

	public ConChocolate(Snack bebida) {
		super(bebida);
		// TODO Auto-generated constructor stub
	}

	//Métodos heredados de SnackDecorator para adicionar ingrediente
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return snack.getDescripcion()+" con chocolate";
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return snack.getCosto()+500;
	}

}
