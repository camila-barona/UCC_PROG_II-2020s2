Proceso entrenamiento_05
	//Defino constantes
	Definir x Como Entero;
	Definir yy Como logico;
	Definir c Como Caracter;
	
	//Defino Variables
	x <- 10;
	yy <- falso; c <- "a";
	Si x > 0 Entonces;
		yy <- Verdadero;
	SiNo
		yy <- Falso;
	Fin Si
	c <- 'b';
	yy <- Verdadero;
    
	//Salida
	Escribir "el valor de x es:", x;
	Escribir "el valor de yy es:", yy;
	Escribir "el valor de c es:", c;
	
	
FinProceso
