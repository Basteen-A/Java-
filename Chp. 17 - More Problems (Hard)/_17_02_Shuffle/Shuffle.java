<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _17_02_Shuffle;

public class Shuffle {
    public void shuffle(int[] cards) {
        for (int i = 1; i < cards.length; i++) {
            int rand = (int) (Math.random() * (i + 1)); // random integer between 0 and i inclusive
            swap(cards, i, rand);
        }
    }

    private void swap(int[] cards, int i, int j) {
        int temp = cards[i];
        cards[i] = cards[j];
        cards[j] = temp;
    }
}
