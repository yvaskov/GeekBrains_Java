package Lesson1;

// Написать метод, который определяет, является ли
// год високосным, и выводит сообщение в консоль.
// Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.

public class Task10 {
    public static void main(String[] args) {
        int year = 1900;

        if (((year % 4 == 0) & (year % 100 != 0)) | (year % 400 == 0)){
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }
}
