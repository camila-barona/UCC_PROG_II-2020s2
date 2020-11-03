package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *         La empresa              * ");
		System.out.println(" *        Pollos Criski            * ");
		System.out.println(" *********************************** ");
		System.out.println();
		
		double  resultado1, horas, salariofinal;  
	  
		Scanner leer = new Scanner(System.in);
	    Scanner in = new Scanner (System.in);
	     int l2=0;
	     int l3=0;
	     int l4=0;
		 String l1=""; 
					      
	    System.out.println("ingrese el nombre del trabajador");
		l1 = leer.nextLine();
	    System.out.println("ingrese los dias que trabajo");
	    l2= leer.nextInt();
        System.out.println("ingrese la cantidad de horas que trabajo");
	    l3 = leer.nextInt();
	    System.out.println("ingrese el valor pagado por hora $");
		l4 = leer.nextInt();
					
	   resultado1 = l2*l4;
	   horas = resultado1*0.5;
	   salariofinal = horas/0.12;
			        
	   System.out.println("el empleado" +l1);
       System.out.println("con  " +l2);
	   System.out.println("dias de trabajo, con " +l3);
       System.out.println("horas de trabajo, donde el valor pagado por hora es de $" +l4);
	   System.out.println("recibe $ " +salariofinal);
				  
	}

 }
		
	 


*********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *         La empresa              * 
 *        Pollos Criski            * 
 *********************************** 

ingrese el nombre del trabajador
Camila
ingrese los dias que trabajo
12
ingrese la cantidad de horas que trabajo
25
ingrese el valor pagado por hora $
4000
el empleadoCamila
con  12
dias de trabajo, con 25
horas de trabajo, donde el valor pagado por hora es de $4000
recibe $ 200000.0



