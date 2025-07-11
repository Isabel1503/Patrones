package co.edu.udistrital.model;

public class Registro {
	String nom;
	String cor;
	
	public Registro(String n, String co) {
		this.nom = n;
		this.cor = co;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	 
}
