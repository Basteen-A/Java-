<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _16_25_LRU_Cache;

public class Node { // public variables for simplicity
    int key;
    String value;
    Node next;
    Node prev;

    public Node(int k, String v) {
        key = k;
        value = v;
        next = null;
        prev = null;
    }

    @Override
    public String toString() {
        return value;
    }
}
