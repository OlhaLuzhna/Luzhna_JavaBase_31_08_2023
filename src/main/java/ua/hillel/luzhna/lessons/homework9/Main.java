package ua.hillel.luzhna.lessons.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int [] team1 = new int[25];
        int [] team2 = new int[25];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) (Math.random() * 23 + 18);

        }
        for (int i = 0; i < team1.length; i++) {
            if (i == team1.length - 1) {
                System.out.print(team1[i]);
            } else {
                System.out.print(team1[i] + ", ");
            }
        }

        System.out.println();

        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) (Math.random() * 23 + 18);

        }
        for (int i = 0; i < team2.length; i++) {
            if (i == team2.length - 1) {
                System.out.print(team2[i]);
            } else {
                System.out.print(team2[i] + ", ");
            }
        }

        System.out.println();

        int sumTeamAge1 = 0;
        int sumTeamAge2 = 0;

        for (int i = 0; i < team1.length; i++) {
            sumTeamAge1 += team1[i];
        }
            int avgTeamAge1 = sumTeamAge1 / team1.length;
            System.out.println("Середній вік гравців перщоі команди = " + avgTeamAge1);


        for (int i = 0; i < team2.length; i++) {
            sumTeamAge2 += team2[i];
        }
        int avgTeamAge2 = sumTeamAge2 / team2.length;
        System.out.println("Середній вік гравців другоі команди = " + avgTeamAge2);

    }
}
