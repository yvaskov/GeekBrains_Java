package Lesson12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstWords {

    public static void main(String[] args) {
        String[] words = {"f","b","a","d","e","c"};
        System.out.println(firstWordsAlphabetical(words));
    }

    public static List<String> firstWordsAlphabetical(String[] words) {
        Stream<String> stream = Stream.of(words);
        return stream
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
    }
}
