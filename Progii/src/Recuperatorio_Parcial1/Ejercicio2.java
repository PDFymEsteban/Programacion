package Recuperatorio_Parcial1;
//ACLARO  SOLO PARA EJEMPLFICAR EL EJERCICIO 2

/*
Ejercicio 3: (15 pts.)
El Principio Abierto/Cerrado (Open/Closed) se define como:
Principio que habla de crear clases extensibles sin necesidad de entrar al código fuente a modificarlo.
El diseño debe ser abierto para poderse extender pero cerrado para poderse modificar.
Se le solicita ejemplificar utilizando para el mismo código JAVA.
 */

//Esta clase va a ser de un empleado
public class Ejercicio2 extends Persona{
    private double sueldo;
    private double horasTrabajo;

    //utilizo de la clase persona para heredar y asi crear mi empleado
    //sin tener que crear otra clase persona y menos modificar dicha clase
    public Ejercicio2(String nombre, int edad, double sueldo, double horasTrabajo) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.horasTrabajo = horasTrabajo;
    }
}
