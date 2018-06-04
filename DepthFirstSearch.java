import java.util.Stack;

public class DepthFirstSearch<T> {
    private Stack<Vertex<T>> stack;

    public DepthFirstSearch() {
        stack = new Stack<>();
    }

    public void depthFirstSearchWithRecursion(Vertex<T> root) {
        System.out.println(root);

        for (Vertex<T> v : root.getNeighbors()) {
            if (!v.getVisited()) {
                v.setVisited(true);
                depthFirstSearchWithRecursion(v);
            }
        }
    }

    public void depthFirstSearchWithStack(Vertex<T> root) {
        root.setVisited(true);
        stack.push(root);

        while (!stack.isEmpty()) {
            Vertex<T> vertex = stack.pop();
            System.out.println(vertex);

            for (Vertex<T> v : vertex.getNeighbors()) {
                if(!v.getVisited()) {
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }
}