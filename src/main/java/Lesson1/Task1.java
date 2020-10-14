package Lesson1;

//Написать метод, принимающий на вход два целых числа и проверяющий
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

public class Task1 {
    public static void main(String[] args) {
        sumInRange(5,6);
    }

    public static boolean sumInRange(int a, int b){
        int c = a + b;
        return c >= 10 && c <= 20;
    }
}
