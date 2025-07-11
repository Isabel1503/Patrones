package co.edu.udistrital.controller;

public class ProxySerie implements Serie  {
	    private SerieReal serieReal;
	    private String nombre;
	    private boolean membresia;

	    public ProxySerie(String nombre, boolean membresia) {
	    	this.nombre = nombre;
	        this.membresia = membresia;
	    }

	    @Override
	    public String ver() {
	    	if (membresia) {
	            if (serieReal == null) {
	                serieReal = new SerieReal(nombre);
	            }
	            return serieReal.ver();
	        } else {
	            return "Solo los usuarios con membresia pueden ver la serie.";
	        }
	    }
}
	



