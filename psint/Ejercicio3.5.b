Proceso MayorOIgual
	Definir n1, n2 Como Entero;
	Escribir "Introduzca un número";
	Leer n1;
	Escribir "Introduzca otro número";
	Leer n2;
	Si n1>=n2 Entonces
		Si n1>n2 Entonces
			Escribir "El valor ", n1, " es mayor";
		SiNo
			Escribir "El valor de n1 es igual al de n2 (",n1, ", ",n2, ")";
		FinSi
	SiNo
		Escribir "El valor ", n2, " es mayor";
	FinSi
	
	// La siguiente también es una solución equivalente
	Si n1>n2 Entonces
		Escribir "El valor ", n1, " es mayor";	
	SiNo
		Si n1<n2 Entonces
			Escribir "El valor ", n2, " es mayor";
		SiNo
			Escribir "El valor de n1 es igual al de n2 (",n1, ", ",n2, ")";
		FinSi
	FinSi
	
FinProceso

		