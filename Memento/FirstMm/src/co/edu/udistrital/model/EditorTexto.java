package co.edu.udistrital.model;

public class EditorTexto {
	private String texto="";

    public void escribir(String nuevoTexto) {
        this.texto = nuevoTexto;
    }

    public String mostrar() {
        return texto;
    }

    public Memento guardar() {
        return new Memento(texto);
    }

    public void restaurar(Memento memento) {
        this.texto = memento.getEstado();
    }

}
