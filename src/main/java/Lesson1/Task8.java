package Lesson1;

// Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое), и с помощью
// цикла(-ов) заполнить его диагональные элементы единицами.

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int a = 7;
        int[][] sqr = new int[a][a];

        for (int i = 0; i < a; i++){
            sqr[i][i] = 1;
            sqr[i][a-1-i] = 1;
        }

        for (int[] line : sqr){
            System.out.println(Arrays.toString(line));
        }
    }
}
