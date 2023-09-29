package ua.hillel.luzhna.lessons.homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        for (int numAttempt = 0; numAttempt < 4; numAttempt++) {
            System.out.println("Введите число от 1 до 10");
            number = (int) (Math.random() * 11);
            if (scanner.hasNextInt()) {
                int userNum = scanner.nextInt();
                if (userNum != number) {
                    System.out.println("Вы не угадали число. Коспьютер загадал " + number);
                }
                else {
                    System.out.println("Правильно. Вы выиграли!");
                    break;
                }
            } else {
                System.out.println("Неверный формат. Введите число от 1 до 10");
                scanner.nextLine();
            }


        }
    }
}