package day_46_oop_part_7_polymorphism.woman;

import day_40_oop_part_3_inheritance_1.j04multilevel.Employee;

public class Wife extends Woman {

    @Override
    public void role() {
        System.out.println("Woman has a wife role at home");
    }
}
