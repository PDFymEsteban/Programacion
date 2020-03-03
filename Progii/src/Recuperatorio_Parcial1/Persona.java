package Recuperatorio_Parcial1;

public class Persona {
    //principio de ocultamiento, para q ninguna otra clase acceda a los atributos de manera directa y los edite o utilice
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }


}
