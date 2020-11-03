package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio01{
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *          Calvin                 * ");
		System.out.println(" *********************************** ");
		System.out.println();
		
		float n, total;
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el numero para totalizar el cubo ");
		n = leer.nextFloat();
		
		total= (float)Math.pow(n,  3);
		
		System.out.println("El valor del cubo es: "+total);
	}	
}



 *********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *          Calvin                 * 
 *********************************** 

Ingrese el numero para totalizar el cubo 
8
El valor del cubo es: 512.0