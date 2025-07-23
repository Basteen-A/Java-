<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _16_20_T9__Trie_Solution;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    private static String[] words = {"tree", "used", "ace", "bee", "bed", "tape", 
                                     "mouse", "pan", "ran", "ninja", "ninjas"};

    public static void main(String[] args) {
        System.out.println("*** Test 16.20: T9 - Trie Solution\n");
        Trie trie = new Trie(words);
        List<String> results = new ArrayList();
        T9.getValidWords(new StringBuffer(), "8733", trie, trie.root, results);
        System.out.println("Matching words: " + results);
    }
}
