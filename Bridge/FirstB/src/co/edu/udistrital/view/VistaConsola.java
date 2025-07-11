package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {
	Scanner sc;
	
	public VistaConsola() {
		sc= new Scanner(System.in);
	}
	
	public void mostrarInformacion(String mensaje ) {
		System.out.println(mensaje);
		
	}
	
	public String leerCadenaTexto(String mensaje) {
		String dato = null;
		System.out.println(mensaje);
		dato = sc.nextLine(); //nextLine lee la linea completa
		return dato;
		}
	
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		System.out.println(mensaje);
		dato = sc.nextInt();
		sc.nextLine();
		return dato;
	}

}
