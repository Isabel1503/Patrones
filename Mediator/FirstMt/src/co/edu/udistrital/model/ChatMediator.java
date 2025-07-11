package co.edu.udistrital.model;

public interface ChatMediator {
	void enviarMensaje(String mensaje, Usuario usuario);
    void agregarUsuario(Usuario usuario);

}
