import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CALCULAR FIBONACCI ===");
        ArrayList<Integer> numbers = generateRandoms();

        for (int number: numbers) {
            System.out.print("- El fibonacci " + number + "° es: ");
            long fibonacci = Fibonacci.Calculate(number);
            System.out.println(fibonacci);
        }
    }

    public static ArrayList<Integer> generateRandoms() {
        ArrayList<Integer> numbers = new ArrayList();
        int number;

        for (int i = 1; i <= 5; i++) {
            number = (int) (Math.random() * 50);
            if (numbers.contains(number)) {
                i--;
            } else {
                numbers.add(number);
            }
        }

        return numbers;
    }
}