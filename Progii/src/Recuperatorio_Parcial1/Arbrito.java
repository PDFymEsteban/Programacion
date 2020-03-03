package Recuperatorio_Parcial1;
//POSDATA NUNCA JUGÉ MONOPOLY, NI SIQUIERA SÉ SI TIENE UN ÁRBRITO

//aqui solo aplico herencia, al igual que juegador
public class Arbrito extends Persona {
    private double pago;

    public Arbrito(String nombre, int edad, double pago) {
        super(nombre, edad);
        this.pago = pago;
    }

    public void mostrarArbrito(){
        System.out.println("Pago al arbrito: " + pago);
    }
}
