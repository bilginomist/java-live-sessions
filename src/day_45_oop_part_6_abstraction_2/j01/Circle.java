package day_45_oop_part_6_abstraction_2.j01;

public class Circle extends Shape{

    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        //pi * r^2
        return Math.PI * radius*radius;
    }
}
