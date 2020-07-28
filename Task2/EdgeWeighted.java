public class EdgeWeighted implements Comparable<EdgeWeighted> {

    // this class defines edges and their parameters
    // uses nodes as starting and ending point to create an edge

    NodeWeighted source;
    NodeWeighted destination;
    double price;

    // edge constructor

    EdgeWeighted(NodeWeighted s, NodeWeighted d, double w) {

        source = s;
        destination = d;
        price = w;
    }

    // this method compares edges to find the one with the lowest price
    public int compareTo(EdgeWeighted otherEdge) {

        if (this.price > otherEdge.price) {
            return 1;
        }
        else return -1;
    }
}
