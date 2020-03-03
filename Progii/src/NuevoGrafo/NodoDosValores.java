package NuevoGrafo;

public class NodoDosValores {
    public String valor1;
    public String valor2;
    public NodoDosValores siguiente;

    public NodoDosValores(String valor1, String valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return valor1 + " " + valor2;
    }
}