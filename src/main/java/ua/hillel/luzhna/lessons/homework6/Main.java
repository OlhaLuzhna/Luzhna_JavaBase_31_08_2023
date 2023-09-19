package ua.hillel.luzhna.lessons.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first team name");
        String Name1 = scanner.nextLine();
        System.out.println("First team name is " + Name1);

        System.out.println("Please enter number of frags for the 1st team member ");
        int frag1t1 = 0;
        if (scanner.hasNextInt()) {
            frag1t1 = scanner.nextInt();
            System.out.println("1 team member frag is  " + frag1t1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter number of frags for the 2snd team member ");
        int frag2t1 = 0;
        if (scanner.hasNextInt()) {
            frag2t1 = scanner.nextInt();
            System.out.println("2 team member frag is  " + frag2t1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter number of frags for the 3d team member ");
        int frag3t1 = 0;
        if (scanner.hasNextInt()) {
            frag3t1 = scanner.nextInt();
            System.out.println("3 team member frag is  " + frag3t1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter number of frags for the 4th team member ");
        int frag4t1 = 0;
        if (scanner.hasNextInt()) {
            frag4t1 = scanner.nextInt();
            System.out.println("4 team member frag is  " + frag4t1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter number of frags for the 5th team member ");
        int frag5t1 = 0;
        if (scanner.hasNextInt()) {
            frag5t1 = scanner.nextInt();
            System.out.println("5 team member frag is  " + frag5t1);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        scanner.nextLine();



        System.out.println("Please enter the second team name");
        String Name2 = scanner.nextLine();
        System.out.println("Second team name is " + Name2);

        System.out.println("Please enter number of frags for the 1st team member ");
        int frag1t2 = 0;
        if (scanner.hasNextInt()) {
            frag1t2 = scanner.nextInt();
            System.out.println("1 team member frag is  " + frag1t2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter number of frags for the 2snd team member ");
        int frag2t2 = 0;
        if (scanner.hasNextInt()) {
            frag2t2 = scanner.nextInt();
            System.out.println("2 team member frag is  " + frag2t2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter number of frags for the 3d team member ");
        int frag3t2 = 0;
        if (scanner.hasNextInt()) {
            frag3t2 = scanner.nextInt();
            System.out.println("3 team member frag is  " + frag3t2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter number of frags for the 4th team member ");
        int frag4t2 = 0;
        if (scanner.hasNextInt()) {
            frag4t2 = scanner.nextInt();
            System.out.println("4 team member frag is  " + frag4t2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        System.out.println("Please enter number of frags for the 5th team member ");
        int frag5t2 = 0;
        if (scanner.hasNextInt()) {
            frag5t2 = scanner.nextInt();
            System.out.println("5 team member frag is  " + frag5t2);
        } else {
            System.out.println("Wrong data!");
            System.exit(0);
        }

        double sumFragsTeam1 = frag1t1 + frag2t1 + frag3t1 + frag4t1 + frag5t1;
        double avgFragsTeam1 = sumFragsTeam1 / 5;

        double sumFragsTeam2 = frag1t2 + frag2t2 + frag3t2 + frag4t2 + frag5t2;
        double avgFragsTeam2 = sumFragsTeam2 / 5;


        if (avgFragsTeam1 > avgFragsTeam2) {
            System.out.println("Перемогла команда " + Name1 + " набрала " + avgFragsTeam1 + " очків");
        } else  if (avgFragsTeam1 < avgFragsTeam2) {
            System.out.println("Перемогла команда " + Name2 + " набрала " + avgFragsTeam2 + " очків");
        } else {
            System.out.println("Нічия!");
        }
    }
}
