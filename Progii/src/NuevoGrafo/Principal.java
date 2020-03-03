package NuevoGrafo;

public class Principal {
    public static void main(String[] args) {
        String[] vertices = {"A","B","C","D","E","F","G"};
        String[][] aristas = {{"A","B"},{"A","B"},{"B","C"},{"F","G"}};

        Grafo g = new Grafo();
        g.construir(vertices,aristas);

        g.imprimirAristas();
        g.imprimirVetices();

        g.conectarVertices("A","C");
        g.conectarVertices("A","C");
        g.conectarVertices("A","B");
        g.conectarVertices("C","F");
        g.imprimirGrafo();

        g.imprimirAristas();

        g.desconectarVertices("A","C");
        g.imprimirGrafo();

        try{
            g.buscarCamino("A","F");
        }   catch (StackOverflowError e){
            System.out.println("error");
        }

        System.out.println("Nodos vecinos de C");
        g.verticesVecinos("C");


        Graph grafo = new Graph(7);

    }
}
