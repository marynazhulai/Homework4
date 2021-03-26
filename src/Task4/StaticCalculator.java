package Task4;

public class StaticCalculator {
    public static double addition(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    public static double subtraction(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    public static double multiplication(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    public static double division(double firstValue, double secondValue) {
        if (secondValue == 0) {
            return 0;
        }

        return firstValue / secondValue;
    }
}
