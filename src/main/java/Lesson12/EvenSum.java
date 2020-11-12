package Lesson12;

import java.util.stream.IntStream;

public class EvenSum {
    public static void main(String[] args) {
        System.out.println(evenSum());
    }

    public static int evenSum() {
        IntStream stream = IntStream.rangeClosed(100, 200);
        return stream
                .filter(n -> n % 2 == 0)
                .reduce(Integer::sum)
                .getAsInt();
    }
}
