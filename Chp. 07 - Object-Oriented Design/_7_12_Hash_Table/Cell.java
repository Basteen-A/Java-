<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _7_12_Hash_Table;

public class Cell<K, V> { // public variables for simplicity.
    K key;
    V value;

    Cell(K k, V v) {
        key = k;
        value = v;
    }

    public boolean equivalent(K k) {
        return key.equals(k);
    }
}
