package Lesson1;

//Написать метод, принимающий на вход два целых числа и проверяющий
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println(c >= 10 & c <= 20);
    }
}
