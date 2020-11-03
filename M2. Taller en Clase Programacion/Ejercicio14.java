package co.edu.campusucc;

public class Ejercicio14 {
	public static void main(String[] args) {
		System.out.println(" ************************************** ");
		System.out.println(" *  Autor: Maria Camila Barona        * ");
		System.out.println(" *  Fecha: 01/OCT 2020                * ");
		System.out.println(" ************************************** ");
		System.out.println(" *       Taller M2 001                * ");
		System.out.println(" *      Tres Embarcaciones            * ");
		System.out.println(" * La pinta, la niña, y la santamaria * ");
		System.out.println(" ************************************** ");
		System.out.println();
	
		System.out.println("La Niña, La Pinta, La Santamaría");
		
		int totalmillas =0;
		int medioviajeIda =600;
		int medioviajeRegreso =600;
		int ninaida = 8, ninavuelta =12;
		int pintaIda = 9, pintavuelta =11;
		int samtariaIda = 10, santamariavuelva= 8;
		int contadorNina=0,contadorPinta=0,contadorSantamaria=0;
		int temporalNina=0, temporalPinta=0, temporalSantamaria=0;
		

		while(contadorNina <= 1200 || contadorPinta <= 1200 || contadorSantamaria <= 1200) {
		
			if(contadorNina <= 1200 ) {
				temporalNina = 8 + 12;
				contadorNina = contadorNina + temporalNina;
				temporalNina = 0;
				if(contadorNina == 1200) {
					System.out.println("Barco NIÑA es la primera en llegar");
				}
				
		  }
			if(contadorPinta <= 1200 ) {
				temporalPinta =  + 11;
				contadorPinta = contadorPinta + temporalPinta;
				temporalPinta = 0;
				if(contadorPinta == 1200) {
					System.out.println("Barco PINTA es la primera en llegar");
				}
			}
			if(contadorSantamaria <= 1200 ) {
				temporalSantamaria = 10 + 8;
				contadorSantamaria = contadorSantamaria + temporalSantamaria;
				temporalSantamaria = 0;
				if(contadorSantamaria== 1200) {
					System.out.println("Barco SANTAMARIA es la primera en llegar");
				}
			}
			
		}
		
		System.out.println("LLEGÓ A 1200");
		
		
	}

	}

	




 ************************************** 
 *  Autor: Maria Camila Barona        * 
 *  Fecha: 01/OCT 2020                * 
 ************************************** 
 *       Taller M2 001                * 
 *      Tres Embarcaciones            * 
 * La pinta, la niña, y la santamaria * 
 ************************************** 

La Niña, La Pinta, La Santamaría
Barco NIÑA es la primera en llegar
LLEGÓ A 1200
