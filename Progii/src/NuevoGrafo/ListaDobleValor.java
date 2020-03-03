package NuevoGrafo;

public class ListaDobleValor {
    private NodoDosValores primero;
    public int tamaño;

    public ListaDobleValor(){
        this.primero = null;
        this.tamaño = 0;
    }

    public boolean vacia(){
        return this.primero == null;
    }

    public void agregar(String valor1, String valor2){

        NodoDosValores nuevo = new NodoDosValores(valor1,valor2);

        if (vacia()){
            // agregar nodo nuevo
            this.primero = nuevo;
        }   else {
            // recorrer la lista hasta llegar al ultimo nodo
            NodoDosValores aux = this.primero;

            while (aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tamaño++;
    }

    public void eliminarultimo(){
        if (vacia()){
            System.out.println("Lista vacia");
        }   else {
            NodoDosValores aux = this.primero;
            NodoDosValores nodoAnterior = aux;

            while (aux.siguiente != null){
                nodoAnterior = aux;
                aux = aux.siguiente;
            }
            nodoAnterior.siguiente = null;
        }
        this.tamaño--;
    }

    public void imprimir(){
        if (vacia()){
            System.out.println("Lista vacia");
        }   else {
            NodoDosValores aux = this.primero;
            for (int i = 0; i < this.tamaño; i++) {
                System.out.println(aux.toString());
                aux = aux.siguiente;
            }
            System.out.println();
        }
    }
}
