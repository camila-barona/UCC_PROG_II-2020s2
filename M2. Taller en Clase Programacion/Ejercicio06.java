package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *         La empresa              * ");
		System.out.println(" *       azucar Manuelita          * ");
		System.out.println(" *********************************** ");
		System.out.println();
	
	double valorh, horast, salario;
	String nombre;
	
	Scanner leer = new Scanner(System.in);
	
	System.out.print("Ingrese el nombre del empleado: ");
	nombre = leer.next();
	System.out.print("Ingrese el valor hora: ");
	valorh = leer.nextFloat();
	System.out.print("Ingrese horas trabajadas: ");
	horast = leer.nextFloat();
	
	salario=valorh*horast;
	
	System.out.println("el salario es: "+salario);
 
  }
}





*********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *         La empresa              * 
 *       azucar Manuelita          * 
 *********************************** 

Ingrese el nombre del empleado: Daniel
Ingrese el valor hora: 4000
Ingrese horas trabajadas: 8
el salario es: 32000.0