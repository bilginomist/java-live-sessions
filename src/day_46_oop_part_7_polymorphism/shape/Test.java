package day_46_oop_part_7_polymorphism.shape;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Shape circle1=new Circle();
        Shape circle2=new Circle();
        Circle circle3=new Circle();

        Cylinder cylinder1=new Cylinder();
        Cylinder cylinder2=new Cylinder();
        Cylinder cylinder3=new Cylinder();


        ArrayList<Shape> list =new ArrayList();

        list.add(circle1);
        list.add(circle2);
        list.add(circle3);

        list.add(cylinder1);
        list.add(cylinder2);
        list.add(cylinder3);




    }
}
