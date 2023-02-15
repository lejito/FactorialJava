import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("=== CALCULAR FACTORIAL ===");
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese un número natural: ");
            String str_number = sc.next();

            if (isNatural(str_number)) {
                int number = Integer.parseInt(str_number);
                int factorial = Factorial.Calculate(number);
                System.out.println("El factorial de " + str_number + " es: " + factorial);
                System.out.println();
            }
            else {
                System.out.println("[!] El número ingresado no es un número natural.");
                System.exit(0);
            }
        }
    }

    public static boolean isNatural(String str) {
        return str != null && str.matches("[0-9]+");
    }
}