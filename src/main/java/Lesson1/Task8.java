package Lesson1;

// Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое), и с помощью
// цикла(-ов) заполнить его диагональные элементы единицами.

public class Task8 {
    public static void main(String[] args) {
        int a = 3;
        int[][] sqr = new int[a][a];

        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                if ((i == j) | (i == a-1-j)){
                    sqr[i][j] = 1;
                }
                System.out.print(sqr[i][j]);
            }
            System.out.println();
        }
    }
}
