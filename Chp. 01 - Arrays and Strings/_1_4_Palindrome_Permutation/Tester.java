<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _1_4_Palindrome_Permutation;

public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test 1.4: Palindrome Permutation\n");
        test("Tact Coa");
        test("race the car");
    }

    private static void test(String str) {
        System.out.println(str + ": " + PalindromePermutation.palPerm(str));
    }
}
