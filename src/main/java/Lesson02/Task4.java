package Lesson02;

// Написать метод, который переворачивает содержимое массива так,
// что на первом месте оказывается последний элемент и т.д.

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random rng = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rng.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        swapArr(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void swapArr(int[] arr) {
        int swap;
        for (int i = 0; i < arr.length / 2; i++) {
            swap = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = swap;
        }
    }
}
