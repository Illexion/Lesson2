import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println("lesson2");
        int[] dataArray1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] dataArray2 = new int[8];
        int[] dataArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int dataArrayLength4 = 5;
        int[][] dataArray4 = new int[dataArrayLength4][dataArrayLength4];
        int[] dataArray5 = {1, 0, 0, 0};
        int shift = 2;

        System.out.println("Задание 1");
        String intDataArray1_Old = Arrays.toString(dataArray1);
        System.out.println(intDataArray1_Old);

        for (int i = 0; i < dataArray1.length; i++) {             // задание 1
            if (dataArray1[i] == 0) {
                dataArray1[i] = 1;
            } else {
                dataArray1[i] = 0;
            }
            //System.out.println(dataArray1[i]);
        }
        String intDataArray1_New = Arrays.toString(dataArray1);
        System.out.println(intDataArray1_New);

        System.out.println("Задание 2");
        int j = 0;                                               // задание 2
        for (int i = 0; i < 22; i++) {
            if (i % 3 == 0) {
                dataArray2[j] = i;
                // System.out.println(dataArray2[j]);
                j++;
            }
        }
        String intDataArray2 = Arrays.toString(dataArray2);
        System.out.println(intDataArray2);

        System.out.println("Задание 3");
        for (int i = 0; i < dataArray3.length; i++) {            // задание 3
            if (dataArray3[i] < 6) {
                dataArray3[i] = dataArray3[i] * 2;
            }
        }
        String intDataArray3 = Arrays.toString(dataArray3);
        System.out.println(intDataArray3);
        System.out.println("Задание 4");
        for (int i = 0; i < dataArrayLength4; i++) {              // задание 4
            for (int k = 0; k < dataArrayLength4; k++) {
                if (i == k || k == dataArrayLength4 - i - 1) {
                    dataArray4[i][k] = 1;
                }
                System.out.print(dataArray4[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("Задание 5");
        Arrays.sort(dataArray3);                                     // задание 5
        System.out.println("Максимальный элемент: " + dataArray3[dataArray3.length - 1]);
        System.out.println("Минимальный элемент: " + dataArray3[0]);


        System.out.println(checkBalance(dataArray5));                   // задание 6
        shiftArray(dataArray3, shift);

    }

    private static boolean checkBalance(int[] checkArray) {
        System.out.println("Задание 6");
        for (int i = 0; i < checkArray.length + 1; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += checkArray[j];
            }
            for (int j = i; j < checkArray.length; j++) {
                rightSum += checkArray[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }

    private static void shiftArray(int[] checkArray, int shift) {           // задание 7
        System.out.println("Задание 7");
        for (int i : checkArray) System.out.print(i + " ");
        System.out.println("\n");
        System.out.print("Смещение " + shift);
        System.out.println("\n");
        if (shift > 0) {
            for (int x = 0; x < shift; x++) {
                int buf = checkArray[checkArray.length - 1];
                if (checkArray.length - 1 >= 0) System.arraycopy(checkArray, 0, checkArray, 1, checkArray.length - 1);
                checkArray[0] = buf;

            }
        }
        if (shift < 0) {
            for (int x = 0; x > shift; x--) {
                int buf = checkArray[0];
                System.arraycopy(checkArray, 1, checkArray, 0, checkArray.length - 1);
                checkArray[checkArray.length - 1] = buf;

            }
        }
        for (int i : checkArray) System.out.print(i + " ");
        System.out.println("\n");
    }
}
