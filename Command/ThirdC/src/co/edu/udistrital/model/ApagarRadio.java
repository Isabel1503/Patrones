package co.edu.udistrital.model;

//Comando Concreto
public class ApagarRadio implements Comando{
	private Radio radio;
	

	public ApagarRadio(Radio radio) {
		this.radio = radio;
	}

	//Médodo que se encarga llamar al metodo apagar del radio
	@Override
	public String ejecutar() {
		return radio.apagar();
		
	}

}
