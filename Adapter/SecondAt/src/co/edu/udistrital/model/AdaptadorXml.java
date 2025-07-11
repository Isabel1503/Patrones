package co.edu.udistrital.model;

public class AdaptadorXml implements XmlAnalizador {

	private LibreriaJson libJson;//Referencia al adaptado(parte incompatible)
	
	//Constructor que recibe una instancia LibreriaJson
	public AdaptadorXml(LibreriaJson libJson) {
		this.libJson = libJson;
	}

	@Override
	public String AnalizadorXml(String info) {
		
		//Se usa el adaptado para procesar Json
		String jsonResult = libJson.AnalizadorJson(info);
		
		//Simulación adaptación a xml
		return "<xml>" +jsonResult +"</xml>";
	}
	
	

}
