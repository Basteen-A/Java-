<<<<<<< HEAD

=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _4_01_Route_Between_Nodes;

import common.GraphNode;

public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test 4.1: Route Between Nodes\n");
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        node1.addNeighbor(node2);
        node2.addNeighbor(node3);
        System.out.println("Route exists? (should be true): " + RouteBetweenNodes.routeExists(node1, node3));
    }
}
