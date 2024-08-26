package day_46_oop_part_7_polymorphism.scope;

public class Child1 extends Parent{


    public void c1() {

        System.out.println("c1 in Child1 ");
    }

    @Override
    public void p1() {
        System.out.println("p1 in child");
    }

    @Override
    public void p2() {
        System.out.println("p2 in child");
    }
}
