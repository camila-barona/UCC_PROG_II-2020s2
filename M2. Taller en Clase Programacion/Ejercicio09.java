package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *          Mafalda                * ");
		System.out.println(" *********************************** ");
		System.out.println();
		
		int numero = 0, sumaDig = 0;
		try (Scanner leer = new Scanner(System.in)) { 
			System.out.println("Ingrese el numero que desee sumar a sus digitos");
			numero = leer.nextInt();
		}
		int num = numero;
		           while (numero != 0 ) {
			    sumaDig = sumaDig + (numero % 10);
			    numero = numero / 10;
			   
		  }
		  
	   System.out.println("la suma de los digitos de"+num+" es:" +sumaDig); 
		  
	  }

  }
		



 *********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *          Mafalda                * 
 *********************************** 

Ingrese el numero que desee sumar a sus digitos
6
la suma de los digitos de6 es:6
