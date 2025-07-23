<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package __Intro_StringBuffer;

public class IntroStringBuffer {
    /*
     * Joins an array of strings into 1 string. Uses StringBuffer for efficiency
     */
    public static String joinWords(String[] strings) {
        StringBuffer sentence = new StringBuffer();
        for (String string : strings) {
            sentence.append(string);
        }
        return sentence.toString();
    }
}
