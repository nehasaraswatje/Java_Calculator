import java.util.Scanner;

public class Calculator {

    // Operation methods
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("⚠️  Error: Cannot divide by zero.");
            return 0;
        }
        return x / y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("=== Welcome to Java Console Calculator ===");

        while (keepRunning) {
            // Menu
            System.out.println("\nSelect an operation:");
            System.out.println("1 → Add");
            System.out.println("2 → Subtract");
            System.out.println("3 → Multiply");
            System.out.println("4 → Divide");
            System.out.println("5 → Exit");
            System.out.print("Enter choice (1-5): ");

            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Thank you for using the calculator. Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (option) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid selection. Please choose between 1 and 5.");
                    continue;
            }

            System.out.printf("✅ Result: %.2f\n", result);
        }

        scanner.close();
    }
}
