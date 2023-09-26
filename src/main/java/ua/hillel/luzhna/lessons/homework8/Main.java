package ua.hillel.luzhna.lessons.homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 11);
        int numAttempt = 10;

        for (int numAttend = 0; numAttend < 10; numAttend++) {
            System.out.println("Введите число от 1 до 10");
            int userNum = scanner.nextInt();
            if (userNum != number) {
                System.out.println("Вы не угадали число. Коспьютер загадал " + number);
            }
            else {
                System.out.println("Правильно. Вы выиграли!");
                break;
            }

        }
    }
}
