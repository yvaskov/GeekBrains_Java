package Lesson05;

import java.util.Arrays;

public class Dictionary {

    private final Pair[] pairs;
    private int count;

    public Dictionary(int size) {
        this.pairs = new Pair[size];
        this.count = 0;
    }

    public void add(String key, String value) {
        if (count == pairs.length) {
            System.out.println("В словаре нет места");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (pairs[i].getKey().equals(key)) {
                System.out.println("Пара с таким ключом уже существует");
                return;
            }
        }
        pairs[count++] = new Pair(key, value);
        System.out.println("Добавлена пара " + pairs[count - 1]);
    }

    public String get(String key) {
        for (int i = 0; i < count; i++) {
            if (pairs[i].getKey().equals(key)) {
                return pairs[i].getValue();
            }
        }
        return null;
    }

    public void printPair(String key) {
        for (int i = 0; i < count; i++) {
            if (pairs[i].getKey().equals(key)) {
                System.out.println(pairs[i]);
                return;
            }
        }
        System.out.println("Нет пары с таким ключом");
    }

    public void delete(String key) {
        for (int i = 0; i < count; i++) {
            if (pairs[i].getKey().equals(key)) {
                System.out.println("Пара " + pairs[i] + " удалена");
                System.arraycopy(pairs, i + 1, pairs, i, count - i - 1);
                pairs[--count] = null;
                break;
            }
        }
    }

    public void printDict() {
        for (int i = 0; i < count; i++) {
            System.out.println(pairs[i]);
        }
    }

    private class Pair {

        private final String key;
        private final String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "[" + key + " : " + value + "]";
        }
    }
}