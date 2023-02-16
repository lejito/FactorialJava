public class Fibonacci {
    public static long Calculate(int number) {
        if (number == 0) {
            return 0;
        }
        else if (number == 1) {
            return 1;
        }
        else {
            return Calculate(number - 1) + Calculate(number - 2);
        }
    }

    public static long CalculateFormula(int number) {
        return (long) ((Math.pow((1 + Math.sqrt(5))/2, number) - (Math.pow((1 - Math.sqrt(5))/2, number))) / (Math.sqrt(5)));
    }
}
