public class App {
    public static void main(String[] args) {
        DepthFirstSearch<String> dfs = new DepthFirstSearch<>();

        Vertex<String> vertex1 = new Vertex<>("1");
        Vertex<String> vertex2 = new Vertex<>("2");
        Vertex<String> vertex3 = new Vertex<>("3");
        Vertex<String> vertex4 = new Vertex<>("4");
        Vertex<String> vertex5 = new Vertex<>("5");

        vertex1.addNeighbor(vertex2);
        vertex1.addNeighbor(vertex4);
        vertex4.addNeighbor(vertex5);
        vertex2.addNeighbor(vertex3);

        // dfs.depthFirstSearchWithRecursion(vertex1);

        dfs.depthFirstSearchWithStack(vertex1);
    }
}