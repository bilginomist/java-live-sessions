package day_46_oop_part_7_polymorphism.woman;

public class Test {


    public static void main(String[] args) {

        /*
        Wife wife=new Wife();
        wife.role();

        Mother mother=new Mother();
        mother.role();

        Employee employee=new Employee();
        employee.role();


         */


        //super class   //sub class
        Woman woman=new Wife();

        woman.role(); //eş rolunu

        woman=new Mother();

        woman.role(); //anne

        woman=new Employee();
        woman.role();

    }
}
