<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _1_3_URLify;

public class Tester {
    public static void main(String[] args) {
        System.out.println("*** Test 1.3: URLify\n");
        URLifyHelper("Ben is smart    ", 12);
    }

    private static void URLifyHelper(String str, int trueLength) {
        char[] sentence = str.toCharArray();
        System.out.println(sentence);
        URLify.replaceWhitespace(sentence, trueLength);
        System.out.println(sentence);
    }
}
