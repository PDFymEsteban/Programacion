package Recuperatorio_Parcial1;
//SOLO PARA ACLARAR EL EJERCICIO 3
public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        Ejercicio 2: (15 pts.)
        Explique por qué a los Objetos que se crean de las distintas Clases en JAVA se los denominan: Tipos por Referencia.
        Ejemplifique utilizando para el mismo código JAVA.
        ACLARACIÓN: El ejemplo debe ser distinto a los vistos en Clases o Guías de Trabajos Prácticos.
         */

        //Objetos instanciados
        //al instanciarlos se crea un nuevo tipo de dato
        Persona persona = new Persona("Esteban",18);
        Jugador jugador = new Jugador("Perdo",27,1200);
        Arbrito arbrito = new Arbrito("Juan",30,5000);
        //no se crea del todo en la memoria ram, sino que se utiliza un fragmento de memoria
        //para redireccionar asi donde se crea el objeto, que es en otro lugar
        //a esto se denomina tipo por referencia
    }
}
