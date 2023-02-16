import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //задача 1
        Student student = new Student("Маша", 123);
        System.out.println("Имя: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("Год обучения: " + student.getYearOfStudy());

        student.incrementYearOfStudy();
        System.out.println("След год обучения: " + student.getYearOfStudy());

        //задача 2
        StarTriangle triangle = new StarTriangle(3);
        System.out.println(triangle.toString());

        //задача 3
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину стороны квадрата: ");
        int a = scanner.nextInt();

        double square = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);
        System.out.println("Площадь квадрата: " + square);
        System.out.println("Периметр квадрата: " + perimeter);
        System.out.println("Диагональ квадрата: " + diagonal);

        //задача 4
        Temperature temp = new Temperature(26.7, 'C');
        System.out.println("Temperature is " + temp.getValue() + temp.getScale());
        System.out.println("In Fahrenheit: " + temp.getFahrenheit());
        temp.setTemperature(80.4, 'F');
        System.out.println("Temperature is " + temp.getValue() + temp.getScale());
        System.out.println("In Celsius: " + temp.getCelsius());



    }
}