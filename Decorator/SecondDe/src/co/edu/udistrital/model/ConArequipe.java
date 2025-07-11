package co.edu.udistrital.model;

public class ConArequipe extends SnackDecorator{

	public ConArequipe(Snack snack) {
		super(snack);
		// TODO Auto-generated constructor stub
	}

	//Métodos heredados de SnackDecorator para adicionar ingrediente
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return snack.getDescripcion() + " con arequipe";
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return snack.getCosto()+400;
	}

}
