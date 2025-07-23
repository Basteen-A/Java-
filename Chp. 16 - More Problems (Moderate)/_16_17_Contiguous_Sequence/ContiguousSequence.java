<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _16_17_Contiguous_Sequence;

public class ContiguousSequence {
    public static int maxSum(int[] array) {
        int runningSum = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            runningSum += array[i];
            if (runningSum < 0) {
                runningSum = 0;
            }
            maxSum = Math.max(maxSum, runningSum);
        }
        return maxSum;
    }
}
