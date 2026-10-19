Proceso BucleMientras
	Definir clave Como Cadena;
	Escribir "Introduzca una clave válida";
	Leer clave;
	Mientras clave <> "abc123" Hacer
		Escribir "Clave incorrecta";
		Escribir "Introduzca una clave válida";
		Leer clave;
	FinMientras
	Escribir "Bienvenido/a";
FinProceso
