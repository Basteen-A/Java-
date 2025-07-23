<<<<<<< HEAD

=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package __Intro_DFS;

import common.GraphNode;
import common.GraphFunctions;

public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test DFS\n");
        GraphNode graphNode = GraphFunctions.createGraph();
        GraphFunctions.DFS(graphNode, 6); // searches for value 6
    }
}
