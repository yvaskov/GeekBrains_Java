package Lesson1;

// Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 2 5 8 11 14 17 20 23.

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] nums = new int[8];

        int i = 2;
        for (int k = 0; k < nums.length; k++) {
            nums[k] = i;
            i += 3;
        }
        System.out.println(Arrays.toString(nums));
    }
}
