package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *       En la escuela             * ");
		System.out.println(" *     Aprendamos Algoritmos       * ");
		System.out.println(" *********************************** ");
		System.out.println();
		
		double costoAV, dinero, devo;
		
		Scanner leer = new Scanner(System.in); 
		
		System.out.print("Ingrese el costo del articulo vendido: ");
		costoAV = leer.nextFloat();
		System.out.print("Ingrese el pago del cliente: ");
		dinero = leer.nextFloat();
		
		
		devo=dinero-costoAV;
		
		System.out.println("el cambio: "+devo);
		
  }	
}



*********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *       En la escuela             * 
 *     Aprendamos Algoritmos       * 
 *********************************** 

Ingrese el costo del articulo vendido: 15000
Ingrese el pago del cliente: 50000
el cambio: 35000.0
