package co.edu.udistrital.model;

public class Factura {
	
	private String nom;
	private double pre;
	
	public Factura(String n, double p ) {
		this.nom = n;
		this.pre = p;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPre() {
		return pre;
	}

	public void setPre(double pre) {
		this.pre = pre;
	}
	
	

}
