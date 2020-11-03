package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *          Mafalda                * ");
		System.out.println(" *********************************** ");
		System.out.println();
	
	double n1, n2, n3, notaf;
	
	Scanner leer = new Scanner(System.in);
	System.out.print("Ingrese la primera nota: ");
	n1 = leer.nextFloat();
	System.out.print("Ingrese la segunda nota: ");
	n2 = leer.nextFloat();
	System.out.print("Ingrese la tercera nota: ");
	n3 = leer.nextFloat();
	
	n1 = n1*0.3;
	n2 = n2*0.3;
	n3 = n3*0.4;
	notaf = n1 + n2 + n3;
	
	System.out.println("La nota final es: "+notaf);
 }		
}



*********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *          Mafalda                * 
 *********************************** 

Ingrese la primera nota: 2,5
Ingrese la segunda nota: 3,8
Ingrese la tercera nota: 4,1
La nota final es: 3.5299999475479127
