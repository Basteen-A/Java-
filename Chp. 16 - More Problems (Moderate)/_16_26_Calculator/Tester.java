<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _16_26_Calculator;

public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test 16.26: Calculator\n");
        test("2-6-7*8/2+5");
    }

    private static void test(String expression) {
        System.out.println(expression + " = " + Calculator.evaluate(expression));
    }
}
