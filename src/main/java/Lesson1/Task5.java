package Lesson1;

// Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] ZO = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < ZO.length; i++){
            if (ZO[i] == 1) ZO[i] = 0;
            else ZO[i] = 1;
        }
        System.out.println(Arrays.toString(ZO));
    }
}
