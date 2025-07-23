<<<<<<< HEAD

=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _4_07_Build_Order;

public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test 4.7: Build Order\n");
        
        String[] projects = {"a", "b", "c", "d", "e", "f"};
        String[][] dependencies = {
                {"a", "d"},
                {"f", "b"},
                {"b", "d"},
                {"f", "a"},
                {"d", "c"}
        };

        try {
            System.out.println(BuildOrder.topoSort(projects, dependencies));
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
