package Lesson12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWords {

    public static void main(String[] args) {
        String[][] words = {{"aa","b","c","d","f"},
                {"a","bb","c","d","f"},
                {"a","b","cc","d","f"},
                {"a","b","c","dd","f"},
                {"a","b","c","d","ff"}};
        System.out.println(findUniques(words));
    }

    public static List<String> findUniques(String[][] words) {
        Stream<String> stream = Stream.of(words).flatMap(Arrays::stream);
        return stream
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
