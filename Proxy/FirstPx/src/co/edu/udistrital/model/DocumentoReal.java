package co.edu.udistrital.model;

public class DocumentoReal implements Documento{
	
	private String contenido;
	
	public DocumentoReal(String contenido) {
        this.contenido = contenido;
    }

	@Override
	public String mostrarContenido() {
		// TODO Auto-generated method stub
		return "Contenido del documento: " + contenido;
	}

}
