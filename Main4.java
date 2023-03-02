import java.util.Scanner;

public class Main4 {
    public static double divide(double x, double y)
            throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Ошибка(на 0 делить нельзя)");
        }
        return x / y;
    }
    public static void main(String[] args) {
        //задача 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        try {
            double number = scanner.nextDouble();
            double square = Math.sqrt(number);
            System.out.println(square);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }

        //задача 2
        double x = 10;
        double y = 0;
        try {
            double result = divide(x, y);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка");
        }

        //задача 3
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner1.nextLine();

        int sum = 0;
        Scanner intScanner = new Scanner(input);
        while (intScanner.hasNext()) {
            try {
                int number = Integer.parseInt(intScanner.next());
                sum += number;
                System.out.println(sum);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода");
            }
        }

    }
}