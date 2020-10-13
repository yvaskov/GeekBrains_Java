package Lesson1;

// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2.

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < nums.length; i++){
            if (nums[i] < 6) nums[i] *= 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
