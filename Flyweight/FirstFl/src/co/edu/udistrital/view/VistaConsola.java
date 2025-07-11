package co.edu.udistrital.view;

import java.util.Scanner;

public class VistaConsola {

	private Scanner sc ;
	
	public VistaConsola() {
		sc = new Scanner(System.in);
	}
	
	public void mostrarInformacion(String mensaje) {
		System.out.println(mensaje);
	}
	
	public int leerDatoEntero(String mensaje) {
		int dato = 0;
		boolean valido = false;
		
		while(!valido) {
			System.out.print(mensaje);
			if(sc.hasNextInt()) {//sc.hasNextInt() verifica si es entero
				dato = sc.nextInt();
				sc.nextLine(); // Limpia el salto de linea
				valido = true;
				
			}else {
				System.out.println("Error, ingrese un número entero");
				sc.nextLine();//Descarta lo que escribio
			}
			
		}
		
		
		return dato;
	}
	
	public String leerCadena(String mensaje) {
		System.out.println(mensaje);
		return sc.nextLine();
			
	}

}
