package ShortcutFunctions;

public class ShortcutFunctions {
    public static double toDouble(String value) {
        return Double.parseDouble(value);
    }

    public static double pow(double number, int exponential) {
        return Math.pow(number, exponential);
    }

    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    public static double calculateDelta(double a, double b, double c) {
        return (pow(b, 2) - 4 * a * c);
    }

    public static String calculateBhaskara(double a, double b, double delta) {
        String result = "";
        if (delta > 0) {
            final double squareOne = (-b + sqrt(delta)) / (2 * a);
            final double squareTwo = (-b - sqrt(delta)) / (2 * a);
            result += "Teremos 2 raizes: " + squareOne + " e " + squareTwo;
        } else if (delta == 0) {
            result += "Teremos 1 raizes: " + (-b) / (2 * a);
        } else {
            result += "Teremos 0 raizes";
        }
        return result;
    }
}
