package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *    empresa casino Royal         * ");
		System.out.println(" *********************************** ");
		System.out.println();
	
	double salario, descuento, valorf;
	String nombre;
	
	Scanner leer = new Scanner(System.in);
	
	System.out.print("Ingrese nombre del empleado: ");
	nombre = leer.next();
	System.out.print("Ingrese del salario: ");
	salario = leer.nextFloat();
	System.out.print("Ingrese el descuento: ");
	descuento = leer.nextFloat();
	
	valorf=salario-descuento;
	
	System.out.println("el valor final: "+valorf);
	
 }	
}




*********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *    empresa casino Royal         * 
 *********************************** 

Ingrese nombre del empleado: Camilo
Ingrese del salario: 870000
Ingrese el descuento: 20000
el valor final: 850000.0
