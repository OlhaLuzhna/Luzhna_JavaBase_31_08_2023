package ua.hillel.luzhna.lessons.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arrayFirst = new int [7];
        int [] arraySecond = new int [7];

        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < arrayFirst.length - 1; i++) {
            for (int j = 0; j < arrayFirst.length - 1 - i; j++) {
                if (arrayFirst[j] < arrayFirst[j + 1]) {
                    int temp = arrayFirst[j];
                    arrayFirst[j] = arrayFirst[j + 1];
                    arrayFirst[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayFirst));


        for (int i = 0; i < arraySecond.length; i++) {
            arraySecond[i] = (int) (Math.random() * 10);
        }

        for (int i = 0; i < arraySecond.length - 1; i++) {
            for (int j = 0; j < arraySecond.length - 1 - i; j++) {
                if (arraySecond[j] < arraySecond[j + 1]) {
                    int temp = arraySecond[j];
                    arraySecond[j] = arraySecond[j + 1];
                    arraySecond[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arraySecond));

        int count = 0;

        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] == arraySecond [i]) {
                count ++;
            }

        }
        System.out.println("Кількість збігів = " + count);

    }
}
