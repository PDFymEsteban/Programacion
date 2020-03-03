package ParcialGrafo1;

public class Nodo {
    public String valor;
    public Nodo siguiente;

    public Nodo(String valor){
        this.valor = valor;
        siguiente = null;
    }

    @Override
    public String toString() {
        return valor;
    }

}
