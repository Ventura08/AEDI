package ShortcutFunctions;

public class ShortcutFunctions {
    public static double toDouble(String value) {return Double.parseDouble(value);}
    public static double pow(double number, int exponential) {return Math.pow(number, exponential);}

    public static double sqrt(double number) {return Math.sqrt(number);}
    public static double CalculateDelta(double a, double b, double c) {
        return (pow(b, 2) - 4 * a * c);
    }

    public static String CalculateBaskara(double a, double b, double delta) {
        if(delta > 0){
            final double squareOne = (- b + sqrt(delta)) / (2 * a);
            final double squareTwo = (- b - sqrt(delta)) / (2 * a);
            return "Teremos 2 raizes: " + squareOne + " e " + squareTwo;
        } else if (delta == 0) {
            return "Teremos 1 raizes: " + (- b ) / (2 * a);
        } else {
            return "Teremos 0 raizes";
        }
    }
}
