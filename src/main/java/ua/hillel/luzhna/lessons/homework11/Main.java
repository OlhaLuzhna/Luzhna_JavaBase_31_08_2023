package ua.hillel.luzhna.lessons.homework11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int M = 0;
        System.out.println("Please enter value M - integer number from 0 to 10");
        while (true) {
            if (scanner.hasNextInt()) {
                M = scanner.nextInt();
                if (M >= 0 && M <= 10) {
                    break;
                } else {
                    System.out.println("Please enter number from 0 to 10");
//                    scanner.nextLine();
                }
            } else {
                System.out.println("Wrong data! Try again!");
//                scanner.nextLine();
            }
            scanner.nextLine();
        }

        int N = 0;
        System.out.println("Please enter value N - integer number from 0 to 10");
        while (true) {
            if (scanner.hasNextInt()) {
                N = scanner.nextInt();
                if (N >= 0 && N <= 10) {
                    break;
                } else {
                    System.out.println("Please enter number from 0 to 10");
//                    scanner.nextLine();
                }
            } else {
                System.out.println("Wrong data! Try again!");
//                scanner.nextLine();
            }
            scanner.nextLine();
        }

        int[][] array1 = new int[N][M];
        int[][] array2 = new int[M][N];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 101);
            }
        }


        System.out.println("Matrix NxM");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                int temp = array1[i][j];
                array1[i][j] = array2[j][i];
                array2[j][i] = temp;
            }
        }

        System.out.println("Transpared Matrix");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }

    }

}


