package ua.hillel.luzhna.lessons.homework2;

public class Main {
    public static void main(String[] args) {

        double longitude = 36.2333324;
        double latitude = 50.002666656;
        char specSymbol1 = '\u00B0';
        char specSymbol2 = '\"';
        char specSymbol3 = '\'';

        System.out.println("Kharkiv Freedom Square Coordinates:");
        System.out.println("Longitude = " + longitude + " Latitude = " + latitude);
        System.out.println("DMS Lat: 50" + specSymbol1 + "0" + specSymbol3 + "20.16" + specSymbol2 + "N" +
                "  DMS Long: 36" + specSymbol1 + "13" + specSymbol3 + "44.76" + specSymbol2 + "E");
    }
}
