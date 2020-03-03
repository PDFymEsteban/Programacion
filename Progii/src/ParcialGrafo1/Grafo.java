package ParcialGrafo1;

public class Grafo {

    private String[] vertices;
    private String[][] aristas;
    private int[][] matriz;


    public void construir(String[] vertices, String[][] aristas){

        this.vertices = vertices;
        this.aristas = aristas;

        matriz = new int[7][7];

        for (int i = 0; i < vertices.length; i++) {
            for (int j = 0; j < vertices.length; j++) {
                matriz[i][j] = 0;
            }
        }

        //cargar el grafo
        for (int i = 0; i < aristas.length; i++) {

            String vertice1 = aristas[i][0];
            String vertice2 = aristas[i][1];

            int iVertice1 = buscarVertice(vertice1);
            int iVertice2 = buscarVertice(vertice2);

            matriz[iVertice1][iVertice2] = 1;
            matriz[iVertice2][iVertice1] = 1;

        }
    }

    public void conectar(String vertice1, String vertice2){
        int iVertice1 = buscarVertice(vertice1);
        int iVertice2 = buscarVertice(vertice2);

        matriz[iVertice1][iVertice2] = 1;
        matriz[iVertice2][iVertice1] = 1;
    }

    public void buscarCamino(String vertice1, String vertice2) {

        ListaSimple camino = new ListaSimple();
        String aux = "";
        int j = buscarVertice(vertice1);
        int k = buscarVertice(vertice2);
        camino.agregar(vertice1);
        camino.agregar(vertice2);
        camino.agregar(vertices[k]);
        camino.agregar(vertices[j]);
        /*for (int i = 0; i < vertices.length; i++) {

            if (matriz[j][i] != matriz[j][k]){
                if (matriz[j][i]==1){
                    camino.agregar(vertice1);
                    camino.agregar(vertice2);
                }   else {
                    camino.agregar(vertices[k]);
                    camino.agregar(vertices[j]);
                    j=i;
                    i=0;
                }
            }
        }*/
        camino.imprimir();
    }

    public void conectarCamino(String vertice1, String vertice2, int ponderacion){
        int i = buscarVertice(vertice1);
        int j = buscarVertice(vertice2);


    }

    public void imprimir(){
        for (int i = 0; i < vertices.length; i++) {
            for (int j = 0; j < vertices.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }


    public int buscarVertice(String vertice){
        for (int i = 0; i < vertices.length; i++) {
            if (this.vertices[i].equals(vertice)){
                return i;
            }
        }
        return -1;
    }
}
