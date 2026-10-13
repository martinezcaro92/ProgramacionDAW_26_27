// ==========================================
// Algoritmo: Ejercicio
// Calcula la nota de un estudiante según dos examenes y una parte práctica
// Entrada: examen1, examen2 y practica (Real)
// Salida:  nota (Real)
// ==========================================

Algoritmo Ejercicio3.1
	Definir examen1, examen2, practica, nota Como Real;
	Leer examen1;
	Leer examen2;
	Leer practica;
	nota <- examen1*0.4 + examen2*0.4 + practica*0.2;
	Escribir nota;
FinAlgoritmo
