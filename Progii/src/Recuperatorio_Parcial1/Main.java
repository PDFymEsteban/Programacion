package Recuperatorio_Parcial1;

public class Main {
    public static void main(String[] args) {

        //principio de composicion
        //creo un objeto, en este caso un arreglo y lo cargo con otros objetos
        Persona[] personas = new Persona[3];
        //polimorfismo, con tan solo instanciar una clase y poder crear objetos de las clases hijas
        //tambien cumple con el upcasting
        personas[0] = new Persona("Esteban",30);
        personas[1] = new Jugador("Pedro",28,4500);
        personas[2] = new Arbrito("Josias",35,6000);


        //downcasting, bajo a la clase jugador
        //para acceder a los metodos de la clase jugador
        Jugador jugador = (Jugador) personas[1];
        jugador.mostrarJugador();
        //lo mismo con la clase arbrito
        Arbrito arbrito = (Arbrito)personas[2];
        arbrito.mostrarArbrito();

    }
}
/*
TUP - Programación II - Primer Recuperatorio                                                07-10-2019

Teoría

Ejercicio 1:  (70 pts.)

Dada la imagen del conocido Juego Monopoly. Utilice todo lo que la misma incluye para escribir  ejemplos.

Se le pide diseñar un modelo de clases (incluyendo propiedades y métodos) para demostrar los siguientes conceptos teóricos:

Principio de Ocultamiento.      hecho
Agregación.
Composición.                    hecho
Herencia entre clases.          hecho
Polimorfismo.                   hecho
Sobrecarga de métodos.          hecho
Upcasting.                      hecho
Downcasting.                    hecho
Definir e Implementar una Interfaz.     hecho

Para cada caso, incluir una justificación que clarifique su ejemplo.

Ejercicio 2: (15 pts.)
Explique por qué a los Objetos que se crean de las distintas Clases en JAVA se los denominan: Tipos por Referencia.
Ejemplifique utilizando para el mismo código JAVA.
ACLARACIÓN: El ejemplo debe ser distinto a los vistos en Clases o Guías de Trabajos Prácticos.
Ejercicio 3: (15 pts.)
El Principio Abierto/Cerrado (Open/Closed) se define como:
Principio que habla de crear clases extensibles sin necesidad de entrar al código fuente a modificarlo.
El diseño debe ser abierto para poderse extender pero cerrado para poderse modificar.

Se le solicita ejemplificar utilizando para el mismo código JAVA.
ACLARACIÓN: El ejemplo debe ser distinto a los vistos en Clases o Guías de Trabajos Prácticos.
*/