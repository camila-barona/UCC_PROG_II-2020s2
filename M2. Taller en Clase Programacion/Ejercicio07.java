package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *         La empresa              * ");
		System.out.println(" *           Paginin               * ");
		System.out.println(" *********************************** ");
		System.out.println();
	
	Scanner in = new Scanner(System.in);
	int l1=0;
    int l2=0;
	int paginas=0;
	int minutos=0;
	
	System.out.print("ingresar las horas: ");
	l1 = in.nextInt();
	
	paginas = 30*2;
	
	System.out.print("En "+l1);
	System.out.print("Horas se escribe "+paginas);
	System.out.print("paginas . ");
	
	System.out.print("Ingrese las paginas ");
	l2 = in.nextInt();
	
	minutos = 30*5;
	
	System.out.print("Las "+l2);
	System.out.print("paginas se escriben en "+minutos);
	System.out.print("minutos. ");
	
	}
}




*********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *         La empresa              * 
 *           Paginin               * 
 *********************************** 

ingresar las horas: 9
En 9Horas se escribe 60paginas . Ingrese las paginas 120
Las 120paginas se escriben en 150minutos. 