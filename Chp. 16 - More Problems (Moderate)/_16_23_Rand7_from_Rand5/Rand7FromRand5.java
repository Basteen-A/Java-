<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _16_23_Rand7_from_Rand5;

public class Rand7FromRand5 {
    public static int rand7() {
        while (true) {
            int num = 5 * rand5() + rand5(); // generates random number between 0 and 24. EVENLY DISTRIBUTED
            if (num < 21) { // discard values 21-24 since they unfairly weight towards 0-3 when doing %7
                return num % 7;
            }
        }
    }

    /* returns an "int": 0, 1, 2, 3, or 4 */
    private static int rand5() {
        return (int) (Math.random() * 5); // casting to "int" always truncates
    }
}
