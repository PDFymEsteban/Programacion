package NuevoGrafo;

public class ListaSiemple {

    private Nodo primero;
    public int tamaño;

    public ListaSiemple() {
        this.primero = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor){

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            //agregar el nodo nuevo
            this.primero = nuevo;
        } else {
            //recorrer la lista hasta llegar hasta el ultimo nodo
            Nodo aux = this.primero;

            while (aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tamaño++;
    }

    public void eliminarUltimo(){
        if (vacia())
            System.out.println("Lista vacia");
        else {

            Nodo aux = this.primero;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null){
                nodoAnterior = aux;
                aux = aux.siguiente;
            }
             nodoAnterior.siguiente = null;
        }

        this.tamaño--;
    }

    public boolean comparar(String buscar){
        if (vacia()){
            System.out.println("Lista vacia");
        }   else {
            Nodo aux = this.primero;

            while (aux.siguiente != null){
                if (aux.valor.equals(buscar)){
                    return true;
                }
            }
        }
        return false;
    }

    public void imprimir(){
        if (vacia()){
            System.out.println("Lista vacia");
        }   else {
            Nodo aux = this.primero;
            for (int i = 0; i < this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
            System.out.println();
        }
    }
}
