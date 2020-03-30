package ue01_taschenrechner;

public class Taschenrechner {

    private static double a;
    private static double b;

    public static void Taschenrechner(double a1, double b1) {
        a = a1;
        b = b1;
    }

    public static double getAdditionResult() {

        return a + b;
    }

    public static double getSubtractionResult() {

        return a - b;
    }

    public static double getMultiplicationResult() {

        return a * b;
    }

    public static double getDivisionResult() {

        return a / b;
    }

}
