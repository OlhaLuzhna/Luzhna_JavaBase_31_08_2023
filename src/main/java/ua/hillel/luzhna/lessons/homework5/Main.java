package ua.hillel.luzhna.lessons.homework5;

public class Main {
    public static void main(String[] args) {

        double warriorLi = 13;
        double archerLi = 24;
        double riderLi = 46;
        double warriorMin = 9;
        double archerMin = 35;
        double riderMin = 12;

        double commonLi = 860 * (13 + 24 + 46);
        double commonMin = 1.5 * 860 * (9 + 35 + 12);

        System.out.println("Li = " + commonLi);
        System.out.println("Min = " + commonMin);
    }
}
