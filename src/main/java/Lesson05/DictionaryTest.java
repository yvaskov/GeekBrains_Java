package Lesson05;

import java.util.Arrays;

public class DictionaryTest {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary(10);

        dict.add("1","2");
        dict.add("3","4");
        dict.add("5","6");

        System.out.println(dict.get("3"));
        dict.printPair("7");
        dict.printDict();

        dict.delete("3");
        dict.printDict();
    }
}

