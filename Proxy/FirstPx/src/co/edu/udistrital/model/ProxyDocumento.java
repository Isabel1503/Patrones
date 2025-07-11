package co.edu.udistrital.model;

public class ProxyDocumento implements Documento  {
	    private DocumentoReal documentoReal;
	    private String usuario;

	    public ProxyDocumento(String usuario) {
	        this.usuario = usuario;
	    }

	    @Override
	    public String mostrarContenido() {
	        if ("admin".equalsIgnoreCase(usuario)) {
	            if (documentoReal == null) {
	                documentoReal = new DocumentoReal("Reporte bancaro.");
	            }
	            return documentoReal.mostrarContenido();
	        } else {
	            return " Acceso denegado. Solo los administradores pueden ver este documento.";
	        }
	    }
	}



