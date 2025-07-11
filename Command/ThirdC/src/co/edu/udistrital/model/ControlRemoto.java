package co.edu.udistrital.model;

//Clase invocador
public class ControlRemoto {
	private Comando comando;


	//Método que recibe el comando a utilizar
	public void setComando(Comando comando) {
		this.comando = comando;
	}
	
	//Método de validación
	public String presionarBoton() {
		if (comando != null) {
           return comando.ejecutar();
        } else {
            return"No hay comando establecido.";
        }	
		
	}
	


}
