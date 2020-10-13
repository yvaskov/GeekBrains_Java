package Lesson1;

// Задать одномерный массив и найти в нем
// минимальный и максимальный элементы.

import java.util.Arrays;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rng.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));

        int max = nums[0];
        int min = nums[0];

        for (int i:nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Минимальное значение: "+ min);
        System.out.println("Максимальное значение: "+ max);
    }
}
