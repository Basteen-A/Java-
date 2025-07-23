<<<<<<< HEAD
// github.com/Basteen-A
=======
// github.com/Basteen-A
>>>>>>> fc671dfccc4c844803cd16bc4e158dfcfa4a68fb

package _16_20_T9__HashMap_Solution;

import java.util.*;

public class Tester {
    private static String[] words = {"tree", "used", "ace", "bee", "bed", "tape", 
                                     "mouse", "pan", "ran", "ninja", "ninjas"};

    public static void main(String[] args) {
        System.out.println("*** Test 16.20: T9 - HashMap Solution\n");
        T9 t9 = new T9();
        Map<String, List<String>> map = t9.buildMap(words);
        System.out.println("Matching words: ");
        for (String word : map.get("8733")) {
            System.out.println(word);
        }
    }
}
