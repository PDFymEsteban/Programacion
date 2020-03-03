package ParcialGrafo1;

public class Main {
    public static void main(String[] args) {
        String[] vertices = {"A","B","C","D","E","F","G"};
        String[][] aristas = {{"A","B"},{"B","C"},{"F","G"}};

        Grafo grafo = new Grafo();
        grafo.construir(vertices,aristas);

        grafo.conectar("C","G");
        grafo.conectar("C","D");

        grafo.imprimir();

        grafo.buscarCamino("C","D");
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