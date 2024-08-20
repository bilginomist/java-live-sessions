package homeworks.hw01_sms;

import java.util.ArrayList;

public class StudentManagementTest {

    public static void main(String[] args) {

        Student student1 = new Student(1, "John", "Doe", 20, 'M');
        Student student2 = new Student(2, "Jane", "Doe", 22, 'F');
        Student student3 = new Student(3, "Alice", "Smith", 19, 'F');
        Student student4 = new Student(4, "John", "Brown", 21, 'M');
        Student student5 = new Student(5, "Charlie", "White", 23, 'M');
        Student student6 = new Student(6, "Diana", "Green", 20, 'F');
        Student student7 = new Student(7, "Eve", "Black", 22, 'F');
        Student student8 = new Student(8, "Frank", "Blue", 19, 'M');
        Student student9 = new Student(9, "Diana", "Yellow", 21, 'F');
        Student student10 = new Student(10, "John", "Pink", 23, 'M');


        StudentManagement sms = new StudentManagement();


        System.out.println("sms.getAllStudents() = " + sms.getAllStudents());


        System.out.println("öğrenci ekle");

        sms.addStudent(student1);
        sms.addStudent(student4);

        System.out.println("sms.getAllStudents() = " + sms.getAllStudents());

        ArrayList<Student> list=new ArrayList<>();
        list.add(student3);
        list.add(student5);
        list.add(student2);
        list.add(student6);
        list.add(student7);

        sms.addAllStudent(list);

        System.out.println("sms.getAllStudents() = " + sms.getAllStudents());

    }
}
