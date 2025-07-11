package co.edu.udistrital.model;

//Esta clase simula un servicio de guardado en la nube
public class ServicioNube {
	
	public String subir(String info) {
		
		//Retorna un mensaje para que otra clase lo use
		return("Subiendo datos a la nube:\n" + info);
	}

}
