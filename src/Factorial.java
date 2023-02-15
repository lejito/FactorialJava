public class Factorial {
    public static int Calculate(int number) {
        if (number == 0) {
            return 1;
        }
        else {
            return number * Calculate(number - 1);
        }
    }
}
