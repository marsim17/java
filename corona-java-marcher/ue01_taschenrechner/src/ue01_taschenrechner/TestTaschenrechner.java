package ue01_taschenrechner;

import java.util.Locale;
import java.util.Scanner;

public class TestTaschenrechner {

    public static void main(String[] args) {

        double a;
        double b;

        Scanner reader = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Wert a: ");
        a = reader.nextDouble();
        System.out.print("Wert b: ");
        b = reader.nextDouble();
        reader.close();

        Taschenrechner.Taschenrechner(a, b);

        String addition = String.format("%.3f", Taschenrechner.getAdditionResult());
        String subtraction = String.format("%.3f", Taschenrechner.getSubtractionResult());
        String multiplication = String.format("%.3f", Taschenrechner.getMultiplicationResult());
        String division = String.format("%.3f", Taschenrechner.getDivisionResult());

        System.out.println("  Addition: " + addition);
        System.out.println("  Subtraktion: " + subtraction);
        System.out.println("  Multiplikation: " + multiplication);
        System.out.println("  Division: " + division);
    }
}
