package Recuperatorio_Parcial1;

//Heredo de Persona, ya que cada jugador es una Persona
//Implemento aqui la interface porque quiero q el jugador sea el que realize las acciones del juego
public class Jugador extends Persona implements Monopoly {
    private double dinero;

    public Jugador(String nombre, int edad, double dinero) {
        super(nombre, edad);
        this.dinero = dinero;
    }

    @Override
    public void Jugar() {

    }

    @Override
    public void Dar(String algo) {

    }

    @Override
    public void Dar(int cantidad) {

    }

    public void mostrarJugador(){
        System.out.println("Dinero del jugador: " + dinero);
    }
}
