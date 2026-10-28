Proceso esPrimo
	// Definición de variables utilizadas en el programa
	Definir num, i Como Entero;
	Definir es_primo Como Logico;
	
	// Pedimos que se inserte el número entero
	Escribir "Introduzca un número entero: ";
	Leer num;
	
	// Comprobamos si el número introducido es <=0 para poner que no es válido
	Si num <=0 Entonces
		Escribir "Número no válido";
	SiNo
		//Si el número es >0, es un número válido
		//damos valor a las variables
		es_primo <- Verdadero;
		i<-num;
		
		//Repetimos el bucle hasta que se cumpla la condición
		Repetir
			//Cambiará el valor de es_primo si se cumplen las siguientes condiciones_
			// num es divisible entre i
			// i es diferente a num
			// i es diferente a 1
			Si (num%i=0) Y (i<>num) Y (i<>1) Entonces
				es_primo<-Falso;
			FinSi
			//Decrementamos en 1 el contador i
			i<- i-1;
		Hasta Que (es_primo=Falso O i=1)
		
		//Comprobamos el valor de la variable es_primo para imprimir por pantalla
		//si es primo o no
		Si es_primo = Verdadero Entonces
			Escribir "El número ", num, " es primo";
		SiNo
			Escribir "El número ", num, " no es primo";
		FinSi
	FinSi
	
	
FinProceso
