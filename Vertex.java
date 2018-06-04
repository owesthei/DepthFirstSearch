import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    private T data;
    private boolean visited;
    private List<Vertex<T>> neighbors;

    public Vertex(T data) {
        this.data = data;
        neighbors = new ArrayList<>();
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean value) {
        visited = value;
    }

    public List<Vertex<T>> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Vertex<T> vertex) {
        neighbors.add(vertex);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}