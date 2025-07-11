package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.List;

public class ChatSala implements ChatMediator{
	private List<Usuario> usuarios = new ArrayList<>();

	@Override
	public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario emisor) {
        for (Usuario u : usuarios) {
            if (!u.equals(emisor)) {
                u.recibir(mensaje);
            }
        }
    }
		
}


