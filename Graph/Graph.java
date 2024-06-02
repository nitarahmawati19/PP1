package Graph;

public class Graph {
    private Vertex[] vertexList; 
    private int[][] adjMat; 
    private int nVerts; 

    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts]; 
        adjMat = new int[maxVerts][maxVerts]; 
        nVerts = 0; 

        // set semua nilai dalam adjacency matrix ke 0
        for(int i = 0; i < maxVerts; i++) {
            for(int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    // method menambahkan vertex baru
    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    // method menambahkan edge antara dua vertex
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1; 
    }
    
    // method menampilkan matriks adjacency
    public void adjacencyMatrix() {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[0].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // method menampilkan vertex
    public void displayVertex(int v) {
        System.out.print(vertexList[v].getLabel());
    }
}
