package day_39_oop_part_2_encapsulation.jo2;

public class EmployeeObj {

    public static void main(String[] args) {


        Employee employee1 = new Employee();
        //artık bunu diytemezsin private
        //   employee1.firstName="1234";
        // employee1.age=13;

        employee1.setFirstName("Ahmet");

        employee1.setAge(18);


       // System.out.println(employee1.age);

        System.out.println(employee1.getAge());

        System.out.println(employee1.getFirstName());



        System.out.println(employee1);

    }
}
