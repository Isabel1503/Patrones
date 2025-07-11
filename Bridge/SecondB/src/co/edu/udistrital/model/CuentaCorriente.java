package co.edu.udistrital.model;

import co.edu.udistrital.view.VistaConsola;

/*Esta clase es una implementación concreta la cual especifica como
se va a realizar el pago mediante una cuenta Corriente*/ 
public class CuentaCorriente implements ICuenta{
	private VistaConsola vista;
	
	public CuentaCorriente() {
		vista = new VistaConsola();
	}

	@Override
	public void enviarD(String monto) {
		vista.mostrarInformacion("El monto sera enviado mediante la cuenta Corriente ******** " +monto);
		
	}

}
