<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package __Intro_StringBuffer;

public class Tester {
    public static void main(String[] args) {
        test(new String[]{ "Hi ", "there ", "Rob. ", "How ", "are ", "you?" });
    }

    private static void test(String[] strings) {
        System.out.println(IntroStringBuffer.joinWords(strings));
    }
}
