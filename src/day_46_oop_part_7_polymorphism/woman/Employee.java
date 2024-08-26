package day_46_oop_part_7_polymorphism.woman;

public class Employee extends Woman{

    @Override
    public void role() {
        System.out.println("Woman is acting like Employee");
    }
}
