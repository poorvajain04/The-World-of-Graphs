import java.util.*;
class Node {
    int val;
    int edge;
    int weight;

    Node(int val, int edge, int wt) {
        this.val = val;
        this.edge = edge;
        this.weight = wt;
    }
}
public class create_graph {
    public static void main(String[] args) {
        int V = 5;
        List<List<Node>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Node(0, 1, 5));
        graph.get(0).add(new Node(0, 2, 10));
        graph.get(1).add(new Node(1, 3, 3));
        for (int i = 0; i < graph.size(); i++) {
            System.out.print(i + " -> ");

            for (Node n : graph.get(i)) {
                System.out.print(n.edge + "(" + n.weight + ") ");
            }

            System.out.println();
        }
    }
}
