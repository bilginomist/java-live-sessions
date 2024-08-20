package day_42_oop_part_4_inheritance_3.super_keyword.method;

public class Manager extends Person{


    @Override
    public void goToOffice() {
        super.goToOffice();
        System.out.println("Müdür odasına git");
    }
}
