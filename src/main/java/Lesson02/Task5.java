package Lesson02;

// Написать метод, которая получает на вход массив
// и перемешивает его элементы случайным образом.
// Для генерации случайного целого числа используйте класс Random.

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(nums));
        randomShuffle(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void randomShuffle(int[] arr) {
        int swap;
        int i1;
        int i2;
        Random rng = new Random();
        for (int k = 0; k < 11; k++) {
            i1 = rng.nextInt(arr.length);
            i2 = rng.nextInt(arr.length);
            swap = arr[i1];
            arr[i1] = arr[i2];
            arr[i2] = swap;
        }
    }
}
