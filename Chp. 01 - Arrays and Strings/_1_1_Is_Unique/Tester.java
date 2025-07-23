<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _1_1_Is_Unique;

public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test 1.1: Unique characters?\n");
        test("Benny");
        test("Ben");
        test("Alex");
    }

    private static void test(String str) {
        System.out.format("%8s: %s%n", str, IsUnique.uniqueCharacters(str));
    }
}
