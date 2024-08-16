package day_39_oop_part_2_encapsulation.j01;

public class StudentObj {


    public static void main(String[] args) {

        Student student1=new Student("Adam",10);
       // student1.firstName="!";

      //  student1.setFirstName("         ");
       // student1.age=-10;

        student1.setAge(-110);
      // System.out.println("student1.firstName = " + student1.firstName);
       System.out.println("student1.firstName = " + student1.getFirstName());




    }
}
