Algoritmo AdivinaNumero
    Definir secreto, num, intentos Como Entero;
    secreto <- aleatorio(1, 100);
    intentos <- 0;
    Repetir
        Escribir "Tu número (1-100):";
        Leer num;
        intentos <- intentos + 1;
        Si num < secreto Entonces
            Escribir "El número secreto es mayor";
        SiNo
            Si num > secreto Entonces
                Escribir "El número secreto es menor";
            FinSi
        FinSi
    Hasta Que num = secreto
    Escribir "¡Acertaste en ", intentos, " intentos!";
FinAlgoritmo
