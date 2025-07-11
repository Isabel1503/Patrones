package co.edu.udistrital.model;

//Comando Concreto
public class EncenderTv implements Comando{
	
	private Televisor tv;
	
	public EncenderTv(Televisor tv) {
		this.tv = tv;
	}

	//Médodo que se encarga llamar al metodo encender del tv
	@Override
	public String ejecutar() {
		return tv.encender();
		
	}

}
