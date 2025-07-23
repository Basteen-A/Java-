<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _10_04_Sorted_Search_No_Size;

public class Listy {
    private int[] array;

    public Listy(int[] arr) {
        array = arr;
    }

    public int elementAt(int index) {
        if (index >= array.length) {
            return -1;
        }
        return array[index];
    }
}
