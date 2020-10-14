package Lesson1;

// Написать метод, в который передается не пустой одномерный
// целочисленный массив, метод должен вернуть true, если в массиве
// есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана
// символами ||, эти символы в массив не входят.

public class Task11 {
    public static void main(String[] args) {
        int[] nums = {5, 1, 1, 1, 1, 1};
        int rightSum = 0;
        int leftSum = 0;
        boolean result = false;

        for (int i:nums){
            rightSum += i;
        }
        for (int i:nums){
            leftSum += i;
            rightSum -= i;
            if (leftSum == rightSum){
                result = true;;
                break;
            }
        }
        System.out.println(result);
    }
}
