package Lesson12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongWords {

    public static void main(String[] args) {
        String words = "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa " +
                "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa " +
                "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa " +
                "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa " +
                "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa " +
                "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa " +
                "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa " +
                "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa " +
                "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa " +
                "aaa aaaa aaa aaaaa aa a aaaaaaa aaaa a aa";
        System.out.println(findLongWords(words));
    }

    public static String findLongWords(String words) {
        Stream<String> stream = Stream.of(words.split(" "));
        return stream
                .filter(w -> w.length() >= 5)
                .collect(Collectors.joining(" "));
    }
}
