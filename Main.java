public class Main {

    public static void main(String[] args) {
        //задача 1
        Student student1 = new Student("Alisa", "Smith", "Koktem-2", 24);
        System.out.println(student1);
        Student student2 = new Student("Azamat", "Olabekov", "Orbita - 3", 25);
        System.out.println(student2);
        Student student3 = new Student("Kristina", "Zavorona", "Almagul ", 26);
        System.out.println(student3);

        //задача 2

        Triangle myTriangle = new Triangle(3, 4, 5);
        System.out.println(myTriangle.S());
        System.out.println(myTriangle.P());

        //задача 3

        Rectangle rectangle1 = new Rectangle(5, 9);
        System.out.println(rectangle1.returnArea());
        Rectangle rectangle2 = new Rectangle(10, 14);
        System.out.println(rectangle2.returnArea());

        //задача 4

        Average average1 = new Average();

        average1.a = 5;
        average1.b = 6;
        average1.c = 7;
        System.out.println(average1.findAverage());

        //задача 5

        Movie movie1 = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");



    }

}