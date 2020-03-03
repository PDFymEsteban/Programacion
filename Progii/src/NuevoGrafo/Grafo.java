package NuevoGrafo;

public class Grafo {

    private String[] vertices;
    private String[][] aristas;
    private int[][] matriz;

    //Construir o inicializar el Grafo a partir de los conjuntos {V} y {E}, tal que {G=(V,E)}.
    public void construir(String[] vertices, String[][] aristas) {
        this.vertices = vertices;
        this.aristas = aristas;
        this.matriz = new int[this.vertices.length][this.vertices.length];

        for (int i = 0; i < this.vertices.length; i++) {
            for (int j = 0; j < this.vertices.length; j++) {
                matriz[i][j] = 0;
            }
        }

        for (int i = 0; i < this.aristas.length; i++) {

            String vertice1 = aristas[i][0];
            String vertice2 = aristas[i][1];

            int iVertice1 = buscarIndiceDeVertice(vertice1);
            int iVertice2 = buscarIndiceDeVertice(vertice2);

            matriz[iVertice1][iVertice2] += 1;
            matriz[iVertice2][iVertice1] += 1;
        }
    }

    //Representar el conjunto de Vértices {V}.
    public void imprimirVetices(){
        for (int i = 0; i < vertices.length; i++) {
            System.out.print(vertices[i] + " ");
        }
        System.out.println("\n");
    }

    //Representar el conjunto de Aristas {E}.
    public void imprimirAristas(){
        ListaDobleValor listaAristas = new ListaDobleValor();

        for (int i = 0; i < vertices.length; i++) {
            for (int j = i; j < vertices.length; j++) {

                if (matriz[i][j] != 0){

                    if (matriz[i][j] == 1){
                        listaAristas.agregar(vertices[i],vertices[j]);
                    }else {
                        listaAristas.agregar(vertices[i],vertices[j]);
                        listaAristas.agregar(vertices[i],vertices[j]);
                    }

                }

            }
        }
        listaAristas.imprimir();
    }

    public void imprimirGrafo(){
        for (int i = 0; i < vertices.length; i++) {
            for (int j = 0; j < vertices.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Incluir un método que permita crear nuevas conexiones entre 2 vértices distintos.
    public void conectarVertices(String vertice1, String vertice2){
        int i = buscarIndiceDeVertice(vertice1);
        int j = buscarIndiceDeVertice(vertice2);

        if (verPosibleConexion(i,j)){
            matriz[i][j] += 1;
            matriz[j][i] += 1;
        }
    }

    //Incluir un método que permita crear nuevas conexiones ponderadas entre 2 vértices distintos,
    //con un máximo de 2 conexiones con un mismo vértice.
    public void conectarVertices(String vertice1, String vertice2, int ponderacion){
        int i = buscarIndiceDeVertice(vertice1);
        int j = buscarIndiceDeVertice(vertice2);

        if (verPosibleConexion(i,j)){
            matriz[i][j] = 1;
            matriz[j][i] = 1;
        }   else System.out.println("No existe coneccion entre los vertices " + vertice1 + " y " + vertice2);
    }

    //Incluir un método para eliminar conexiones entre 2 vértices distintos, sabiendo que pueden
    //haber 2 conexiones con el mismo vértice.
    public void desconectarVertices(String vertice1, String vertice2){
        int i = buscarIndiceDeVertice(vertice1);
        int j = buscarIndiceDeVertice(vertice2);

        if (verPosibleConexion(i,j)){
            matriz[i][j] -= 1;
            matriz[j][i] -= 1;
        }
    }

    // método para verificar si el vértice dado ya tiene dos aristas con el otro vertice dado
    public boolean verPosibleConexion(int i, int j){

        if ((matriz[i][j] < 2) && (matriz[i][j] >= 0)){
            System.out.println("Conexion realizada entre " + buscarVertice(i) + " y " + buscarVertice(j));
            return true;
        }else System.out.println("<error>");
        return false;
    }

    public void verticesVecinos(String vertice){
        ListaSiemple nodoVecinos = new ListaSiemple();

        // obtengo la posicion de la matriz
        // del argumento 'vertice'
        int iVertice = buscarIndiceDeVertice(vertice);

        // recorro las filas de la columna
        // del vertice hasta encontrar un valor
        // mayor a 0
        for (int i = 0; i < vertices.length; i++) {

            // obtengo el nombre del nodo
            // que corresponde a la posicion de
            // la columna del vertice
            int valor = matriz[iVertice][i];

            // si el valor es mayor a cero
            // lo agrego a la TAD lista
            if (valor > 0){
                String nodo = vertices[i];
                nodoVecinos.agregar(nodo);
            }
        }

        // imprimo la lsita de los nodos vecino
        // del argumento 'vertice'
        nodoVecinos.imprimir();
    }

    public ListaSiemple buscarCamino(String vertice1, String vertice2){
        ListaSiemple camino = new ListaSiemple();
        camino.agregar(vertice1);
        int iVertice = buscarIndiceDeVertice(vertice1);
        int jVertice = buscarIndiceDeVertice(vertice2);

        boolean encontrado = true;

        if (encontrado){
            for (int i = 0; i < this.vertices.length; i++) {
                if (matriz[iVertice][i] == jVertice){
                    camino.agregar(vertice2);
                    return camino;
                }
            }
        }   else {
            encontrado = false;
            while (encontrado){
                for (int i = 0; i < this.vertices.length; i++) {

                    if (matriz[iVertice][i] != 0){
                        camino.agregar(vertices[i]);
                        iVertice = i;
                    }

                }
            }
        }
        return camino;
    }

    private int buscarIndiceDeVertice(String vertice){

        // buscar en el arreglo de vertices, ya que la matriz esta hecha por tal tanto en fila como columna
        for (int i = 0; i < this.vertices.length; i++) {
            if (vertices[i] == vertice){
                return i;
            }
        }
        return -1;
    }

    public String buscarVertice(int indice){
        // aqui es lo mismo, solo que vamos a retornar el vértice que se encuentra en el índice dado
        // No hace falta recorrer
        return vertices[indice];
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