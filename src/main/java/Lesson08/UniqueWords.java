package Lesson08;

import java.util.HashMap;
import java.util.Map;

public class UniqueWords {

    public static void main(String[] args) {
        String[] words = {"123", "123",
                "456", "789", "000", "123",
                "456", "123", "456", "789"};
        printUniques(words);
    }

    public static void printUniques(String[] words) {
        Map<String, Integer> uniques = new HashMap<>();
        int count;

        for (String word : words) {
            if (!uniques.containsKey(word)) {
                uniques.put(word, 1);
                continue;
            }
            count = uniques.get(word);
            uniques.put(word, ++count);
        }
        System.out.println(uniques);
    }
}
