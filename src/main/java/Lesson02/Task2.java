package Lesson02;

// Написать реализацию алгоритма сортировки
// массива методом выбора (selection sort).

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random rng = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rng.nextInt(100);
        }
        System.out.println(Arrays.toString(nums));
        sortAsc(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortAsc(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int min = arr[i];
            int transId = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    transId = j;
                }
            }
            if (min < arr[i]){
                arr[transId] = arr[i];
                arr[i] = min;
            }
        }
    }
}
