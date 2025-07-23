<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _5_6_Conversion;

import common.BitFunctions;

public class Conversion {
    public static int bitsRequired(int A, int B) {
        int xored = A ^ B;
        return BitFunctions.numOnes(xored);
    }
}
