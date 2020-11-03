package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *         La empresa              * ");
		System.out.println(" *        yomonto moto             * ");
		System.out.println(" *********************************** ");
		System.out.println();
	
	   double recargo, salario, salarioFinal;
		 int l2, l3, l4;
		 String l1=""; 
		 Scanner leer = new Scanner (System.in);
		 Scanner in = new Scanner (System.in);
		 
			 System.out.println(" ingrese el nombre del empleado");
			 l1 = leer.nextLine();
			 System.out.println(" ingrese el codigo");
			 l2  = in.nextInt();
			 System.out.println(" ingrese el valor de horas laborales $");
			 l3  = in.nextInt();
			 System.out.println(" ingrese el numero de horas trabajadas");
			 l4  = in.nextInt();
			 
			
			 salario = l3*l4;
		     recargo = salario*0.2;
		     salarioFinal = salario+recargo;
            
             if (l4>48) {
             System.out.print(" el salario final es de" +l1);
             System.out.print("registrado con el codigo" +12);
             System.out.print("es: $ "+salario);
             }
             else if (l4>48) {        
	         System.out.print(" el salario final es de" +l1);
             System.out.print("registrado con el codigo" +12);
             System.out.print("es: $ "+salario);
	  
	
              }
                }	 
	}




*********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *         La empresa              * 
 *        yomonto moto             * 
 *********************************** 
ingrese el nombre del empleado
Valeria
 ingrese el codigo
67
 ingrese el valor de horas laborales $
50
 ingrese el numero de horas trabajadas
50
 el salario final es deValeriaregistrado con el codigo12es: $ 2500.0