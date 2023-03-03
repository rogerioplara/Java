package oop_student.src;

import java.util.Locale;
import java.util.Scanner;

import oop_student.entities.Student;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student);
        student.isApproved();

        sc.close();
    }

}
