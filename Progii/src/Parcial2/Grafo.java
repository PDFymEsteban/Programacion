package Parcial2;

public class Grafo {

    private String[] vertices;
    private String[][] aristas;
    private int[][] matriz;

    // Construir grafo
    public void construir(String[] vertices, String[][] aristas){

        this.vertices = vertices;
        this.aristas = aristas;

        matriz = new int[vertices.length][vertices.length];

        // Inicializar grafo
        for (int i = 0; i < vertices.length; i++) {
            // columnas
            for (int j = 0; j < vertices.length; j++) {
                matriz[i][j] = 0;
            }
        }

        // cargar grafo
        for (int i = 0; i < aristas.length; i++) {

            String vertice1 = aristas[i][0];
            String vertice2 = aristas[i][1];

            int iVertice1 = buscarVertice(vertice1);
            int iVertice2 = buscarVertice(vertice2);

            matriz[iVertice1][iVertice2] = 1;
            matriz[iVertice2][iVertice1] = 1;
        }
    }

    // Nuevas conexiones
    public void conectar(String vertice1, String vertice2){
        int iVertice1 = buscarVertice(vertice1);
        int iVertice2 = buscarVertice(vertice2);

        matriz[iVertice1][iVertice2] = 1;
    }

    // Nuevas conexiones con Ponderacion
    public void conectar(String vertice1, String vertice2, int ponderacion) {
        int iVertice1 = buscarVertice(vertice1);
        int iVertice2 = buscarVertice(vertice2);

        matriz[iVertice1][iVertice2] = 1;
    }

    // Recorrerlo
    public void imprimir() {

        for (int i = 0; i < vertices.length; i++) {
            // columnas
            for (int j = 0; j < vertices.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Vecinos
    public ListaSimple vecinos(String vertice){
        // creo una TAD Lista para guardar
        // nodos vecinos al argumento 'vertice'
        ListaSimple nodosVecinos = new ListaSimple();

        // Obtengo la posicion de la matriz
        // del argumento 'vertice'
        int iVertice = buscarVertice(vertice);

        // Recorro las filas de la columna
        // del vertice hasta encontrar un valor
        // mayor a 0.
        for (int i = 0; i < vertices.length; i++) {

            // Obtengo el nombre del nodo
            // que corresponde a la posicion de
            // la columna del vertice
            int valor = matriz[iVertice][i];

            // Si el valor es mayor a cero,
            // lo agrego a la TAD Lista.
            if (valor > 0){
                String nodo = vertices[i];
                nodosVecinos.agregar(nodo);
            }

        }
        nodosVecinos.imprimir();
        // Retorno la lista de vecinos del
        // argumento 'vertice'
        return nodosVecinos;
    }

    // Buscar
    public void buscar(String vertice){

    }

    // Insertar Nuevo
    public void insertar(String vertice) {

    }

    // Eliminar
    public void eliminar(String vertice){

    }

    // Recorrer
    public void recorrer(String vertice1, String vertice2){

    }

    private int buscarVertice(String vertice) {
        for (int i = 0; i < this.vertices.length; i++) {
            if (this.vertices[i].equals(vertice)) {
                return i;
            }
        }

        return -1;
    }

}
/*
Ejercicio 5: (50 pts.)
Un multigrafo es un grafo que está facultado para tener aristas múltiples; es decir, aristas que relacionan los mismos nodos.
Se le solicita construir un TAD Grafo que posea las siguientes capacidades:
Representar el conjunto de Vértices {V}.
Representar el conjunto de Aristas {E}.
Un vértice V puede tener un máximo de 2 conexiones con un mismo nodo.
Construir o inicializar el Grafo a partir de los conjuntos {V} y {E}, tal que {G=(V,E)}.
Debe almacenar en memoria la información sobre los posibles caminos.
Incluir un método que permita crear nuevas conexiones entre 2 vértices distintos.
Incluir un método que permita crear nuevas conexiones ponderadas entre 2 vértices distintos,
con un máximo de 2 conexiones con un mismo vértice.
Incluir un método para eliminar conexiones entre 2 vértices distintos, sabiendo que pueden
haber 2 conexiones con el mismo vértice.
Incluir un método que retorne todos los nodos adyacentes a un vértice dado.
Incluir un método que permita imprimir por pantalla la representación del Grafo y sus conexiones.
Se le pide:
Implemente el método Main donde demuestre como se puede crear e inicializar el Grafo, además de
demostrar cada uno de los métodos solicitados.
Imprima por pantalla el Grafo. (Debe imprimir todos los puntos y sus respectivos valores de conexiones)
ACLARACIÓN
Puede utilizar cualquiera de los Ejemplos que se encuentran en Github de la materia para completar el ejercicio. (ver ejemplos)
Realice los ajustes que considera necesario en los ejemplos de clases con el fin de cumplir con el ejercicio.
 */