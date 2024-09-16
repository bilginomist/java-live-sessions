package day_56_method_reference_comparator.comparator;

import java.util.*;

public class J04_SortStudentWithDifferentFields {

    public static void main(String[] args) {

        Student student1=new Student("A","E",5);
        Student student2=new Student("B","D",3);
        Student student3=new Student("A","C",2);
        Student student4=new Student("D","B",4);
        Student student5=new Student("D","A",6);

        List<Student> students=new ArrayList<>(Arrays.asList(student3,student2,student1,student5,student4));


        System.out.println(students);


        Comparator<Student>  sortByFirstNameThenLastName=Comparator
                //önce first name göre küçükten büyüğe sırala
                .comparing(Student::getFirstName)
                //sonra last name göre sırala
                .thenComparing(Student::getStudentNumber)
                .thenComparing(Student::getLastName)
                ;

        students.sort(sortByFirstNameThenLastName);

        System.out.println(students);


    }
}
