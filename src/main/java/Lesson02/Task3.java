package Lesson02;

// Написать метод, который в качестве параметра
// получает число секунд в виде целого числа и преобразует
// его в строку вида чч:мм:сс, где чч - кол-во часов,
// мм - количество минут, сс - количество секунд в исходном значении

import java.text.DecimalFormat;

public class Task3 {
    public static void main(String[] args) {
        int sec = 359999;
        hmsTime(sec);
    }

    public static void hmsTime(int sec){
        int s = sec % 60;
        sec /= 60;
        int m = sec % 60;
        int h = sec / 60;
        DecimalFormat f = new DecimalFormat("00");
        if (h < 100) {
            System.out.println(f.format(h) + ":" + f.format(m) + ":" + f.format(s));
        } else {
            System.out.println("Заданное время превышает 100 часов");
            System.out.println("Невозможно отобразить в формате чч:мм:сс");
        }
    }
}
