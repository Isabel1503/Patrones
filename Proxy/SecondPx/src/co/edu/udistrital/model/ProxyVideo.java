package co.edu.udistrital.model;

public class ProxyVideo implements Video  {
	    private VideoReal videoReal;
	    private String nombre;
	    private boolean esPremium;

	    public ProxyVideo(String nombre, boolean esPremium) {
	    	this.nombre = nombre;
	        this.esPremium = esPremium;
	    }

	    @Override
	    public String descargar() {
	    	if (esPremium) {
	            if (videoReal == null) {
	                videoReal = new VideoReal(nombre);
	            }
	            return videoReal.descargar();
	        } else {
	            return "Solo los usuarios premium pueden descargar el video.";
	        }
	    }
}
	



