package ParcialGrafo1;

public class ListaSimple {
    private Nodo primero;
    private int tamaño;

    public boolean vacio(){
        return this.primero == null;
    }

    public void agregar(String valor){

        Nodo nuevo = new Nodo(valor);

        if (vacio()){
            //si es true cargamos
            this.primero = nuevo;
        }
        else {
            //sino recorrer la lista hasta el ultimo nodo
            Nodo aux = this.primero;

            while (aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;

        }
        this.tamaño++;
    }

    public void eliminarUltimo(){
        if (vacio()){
            System.out.println("Lista vacia");
        }
        else {
            //debemos recorrer hasta el ultimo nodo
            Nodo aux = this.primero;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null){
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.
            if (aux == this.primero){
                this.primero = null;
            }
            else {
                // le asigno null al ultimo nodo
                nodoAnterior.siguiente = null;
            }
            this.tamaño--;
        }
    }

    public void imprimir(){
        if (vacio()){
            System.out.println("Lista Vacia");
        }
        else {
            Nodo aux = this.primero;
            for (int i = 0; i < this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}
