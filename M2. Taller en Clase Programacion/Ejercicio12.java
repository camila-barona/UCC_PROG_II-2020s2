package co.edu.campusucc;

public class Ejercicio12 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *     Un caracol un ciempies      * ");
		System.out.println(" *           y un Gusano           * ");
		System.out.println(" *********************************** ");
		System.out.println();
		
		System.out.println("Caracol Ciempies Gusano");
		int acumuladorGusano=0,acumuladorCaracol=0,acumuladorCien=0, avanzaCien = 4, avanzaCaracol=3,avanzaGusano=4, 
				retrocedeCien=3, retrocedeCaracol=2,retrocedeGusano=2;
		while(acumuladorGusano <=10 || acumuladorCaracol <=10 || acumuladorCien <=10) {
			if(acumuladorGusano <= 10) {
				avanzaGusano = avanzaGusano + 4;
				retrocedeGusano = retrocedeGusano - 2;
				acumuladorGusano = avanzaGusano - retrocedeGusano;
				System.out.println("GUSANO  " + acumuladorGusano);
			}
			if(acumuladorCaracol <=10) {
				avanzaCaracol = avanzaCaracol+3;
				retrocedeCaracol= retrocedeCaracol-2;
				acumuladorCaracol = avanzaCaracol - retrocedeCaracol;
				System.out.println("CARACOL  " + acumuladorCaracol);
			}
			if(acumuladorCien <= 10) {
				avanzaCien = avanzaCien + 4;
				retrocedeCien = retrocedeCien -3;
				acumuladorCien = avanzaCien - retrocedeCien;
				System.out.println("CIEMPIES  " + acumuladorCien);
			}
			
			if(acumuladorGusano >=10) {
				System.out.println("El primero en llegar es GUSANO");
				
			}else if(acumuladorCaracol >=10) {
				System.out.println("El primero en llegar es CARACOL");
				
			}else if(acumuladorCien >=10){
				System.out.println("El primero en llegar es CIEMPIES");
			}
		}
		
		
	}

	}
		
		
	



*********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *     Un caracol un ciempies      * 
 *           y un Gusano           * 
 *********************************** 

Caracol Ciempies Gusano
GUSANO  8
CARACOL  6
CIENPIES  8
GUSANO  14
CARACOL  11
CIEMPIES  15
El primero en llegar es GUSANO
