package Lesson06;

public class Exceptions {

    public static void main(String[] args) {

        String[][] arr = {{"1","1","1","1"},
                        {"1","1","1","1"},
                        {"1","1","1","1"},
                        {"1","1","1","1","f"}};
        try {
            arraySum(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static void arraySum(String[][] arr) {
        if (arr.length != 4) {
            throw new MyArraySizeException(
                    "Массив не соответствует размеру 4х4");
        }
        for (String[] row : arr) {
            if (row.length != 4) {
                throw new MyArraySizeException(
                        "Массив не соответствует размеру 4х4");
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                try {
                    Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            "Неверные данные в ячейке [" + ++i + ":" + ++j + "]");
                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        System.out.printf("Сумма элементов массива: %d", sum);
    }
}
