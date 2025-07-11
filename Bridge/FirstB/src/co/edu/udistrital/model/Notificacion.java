package co.edu.udistrital.model;

public abstract class Notificacion {
	ICanalComunicacion canalcomunicacion;/*como notificacion no sabe como funciona
	 un canal de comunicacion dicha clase depende de una interfaz
	que dice qué puede hacer un canal de comunicación, pero no cómo lo hace */
	
	public Notificacion(ICanalComunicacion canalcomunicacion) {
		this.canalcomunicacion = canalcomunicacion;
		/*El contructor recibe una impementacion concreta
		 y la guarda en la variable */
	}
	public abstract void enviar(String mensaje);

}
