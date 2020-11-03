package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *    ciencia de los calculos      * ");
		System.out.println(" *           absolutin             * ");
		System.out.println(" *********************************** ");
		System.out.println();
	
		Scanner entrada= new Scanner(System.in);
		 
		 int numero;
		 System.out.print("ingrese un numero");
		 numero = entrada.nextInt();
		 
		 if (numero <0)
			 System.out.print("el numero es: " +numero+" y su valor absolosuto es:" +Math.abs(numero));
		 else
			 System.out.print("El numero es: " + numero);
		 
  }
}
	
	

 *********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *    ciencia de los calculos      * 
 *           absolutin             * 
 *********************************** 

ingrese un numero 3
El numero es: 3