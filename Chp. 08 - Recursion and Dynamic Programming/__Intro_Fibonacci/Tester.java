<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package __Intro_Fibonacci;

public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test Fibonacci");
        for (int i = 0; i < 16; i++) {
            System.out.print(Fibonacci.fibRecursive(i) + " ");
        }
        
        System.out.println();
        for (int i = 0; i < 16; i++) {
            System.out.print(Fibonacci.fibIterative(i) + " ");
        }
        
        System.out.println();
        for (int i = 0; i < 16; i++) {
            System.out.print(Fibonacci.fibIterativeNoArray(i) + " ");
        }
    }
}
