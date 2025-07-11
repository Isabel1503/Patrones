package co.edu.udistrital.model;

import co.edu.udistrital.view.VistaConsola;

/*Esta clase es una implementación concreta la cual especifica como
se va a realizar el pago mediante una cuenta Digital*/ 
public class CuentaDigital implements ICuenta{
private VistaConsola vista;
	
	public CuentaDigital() {
		vista = new VistaConsola();
	}

	@Override
	public void enviarD(String monto) {
		vista.mostrarInformacion("El monto fue enviado mediante la cuenta digital ******* "+monto);
		
	}

}
