public class Ejercicio02 {
	public static void main(String[] args) {
		System.out.println(" *********************************** ");
		System.out.println(" *  Autor: Maria Camila Barona     * ");
		System.out.println(" *  Fecha: 01/OCT 2020             * ");
		System.out.println(" *********************************** ");
		System.out.println(" *       Taller M2 001             * ");
		System.out.println(" *      Calvin y hobbes            * ");
		System.out.println(" *********************************** ");
		System.out.println();
		
		float a1, b2, suma, resta, prom, producto;
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el primer numero: ");
		a1 = leer.nextFloat();
		System.out.print("Ingrese el primer numero: ");
		b2 = leer.nextFloat();
		
		suma=a1+b2;
		resta=a1-b2;
		prom=(a1+b2)/2;
		producto=a1*b2;
		
		System.out.println("El valor de la suma es: "+suma);
		System.out.println("El valor de la resta es: "+resta);
		System.out.println("El valor del promedio es: "+prom);
		System.out.println("El valor del producto es: "+producto);
	}					
}




 *********************************** 
 *  Autor: Maria Camila Barona     * 
 *  Fecha: 01/OCT 2020             * 
 *********************************** 
 *       Taller M2 001             * 
 *      Calvin y hobbes            * 
 *********************************** 

Ingrese el primer numero: 1
Ingrese el primer numero: 5
El valor de la suma es: 6.0
El valor de la resta es: -4.0
El valor del promedio es: 3.0
El valor del producto es: 5.0
