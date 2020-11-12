package Lesson12;

import java.util.stream.Stream;

public class TotalLength {

    public static void main(String[] args) {
        String[] strings = {"aa","b","c","ddd","f"};
        System.out.println(totalLength(strings));
    }

    public static int totalLength(String[] strings) {
        Stream<String> stream = Stream.of(strings);
        return stream
                .reduce((s1, s2) -> s1 + s2)
                .get()
                .length();
    }
}
