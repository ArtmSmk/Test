import java.util.LinkedList;
public class NodeWeighted {

    // this class defines nodes (cities) and their parameters

    int id;
    String name;
    private boolean visited; // defines if node was already visited
    LinkedList<EdgeWeighted> edges; // number of paths connected to the node

    // node constructor

    NodeWeighted(int n, String name) {
        this.id = n;
        this.name = name;
        visited = false;
        edges = new LinkedList<>();
    }

    boolean isVisited() {

        return visited;
    }

    void visit() {

        visited = true;
    }

}
