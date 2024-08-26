package day_46_oop_part_7_polymorphism.scope;

public class Test {


    public static void main(String[] args) {

        Parent parent=new Child1();

        //sol taraf yani super class neyin ulaşilebilir olduğuna karar veriypr
        //sağ taraf yani sub class neyin yapılacağına karar veriyor
        parent.p2();


        Parent parent1=new Child2();

        //p1 ve p2

        parent1.p1();

        parent1.p2();


        //Reference Type Casting
        /*double a=5;

        int b= (int) a;

         */

        ((Child1)parent1).c1();


    }
}
