package co.edu.udistrital.model;

import java.util.ArrayList;
import java.util.List;

public class MuroPlataforma implements MuroMediator{
	private List<Editor>editores = new ArrayList<>();

	@Override
	public void agregarEditor(Editor editor) {
		editores.add(editor);
    }

    @Override
    public void enviarMensaje(String mensaje, Editor emisor) {
        for (Editor u : editores) {
            if (!u.equals(emisor)) {
                u.recibir(mensaje);
            }
        }
    }
		
}


