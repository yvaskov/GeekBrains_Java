package Lesson02;

// Написать программу, которая выводит на экран равнобедренный
// треугольник из звездочек. Ширина основания - любое нечетное число.
// Начинать вывод с вершины.

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        drawTriangle(7);
    }

    public static void drawTriangle(int base){
        char[][] tri = new char[base / 2 + 1][base];
        int bottomRowNo = base / 2;
        for (int i = 0; i < base; i++){
            tri[bottomRowNo][i] = '*';
        }
        for (int i = bottomRowNo - 1; i >= 0; i--){
            tri[i][bottomRowNo - i] = '*';
            tri[i][i + bottomRowNo] = '*';
        }
        for (char[] line : tri){
            System.out.println(Arrays.toString(line));
        }
    }
}
