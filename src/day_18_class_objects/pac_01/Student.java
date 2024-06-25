package day_18_class_objects.pac_01;

public class Student {

    public String firstName;
    public String lastName;
    public int age;
    public char gender;


    public void study(){

        System.out.println(firstName + " ders çalışmak zorunda.");
    }

public static String courseName(){

       return  "Bilginomist";
}




    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
