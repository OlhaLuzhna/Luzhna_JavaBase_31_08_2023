package ua.hillel.luzhna.lessons.homework7;

public class Main {
    public static void main(String[] args) {

       int counter = 0;
        for (int i = 0; i < 155; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i / 10 % 10 == 4 || i % 10 == 4 || i% 10 == 9) {
                continue;
            }
            counter++;
            System.out.println("Shuttle number = " + i);
        }
        System.out.println("Counter = " + counter);
    }
}
