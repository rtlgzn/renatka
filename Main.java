import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Main {

    public static void main(String[] args) {

        //задача 4
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5));
        students.add(new Student(3));
        students.add(new Student(4));

        for (Student student : students) {
            System.out.println(student.getGrade());
        }

    }
}


