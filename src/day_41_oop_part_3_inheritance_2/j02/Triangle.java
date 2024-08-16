package day_41_oop_part_3_inheritance_2.j02;

public class Triangle extends Shape{

/*
    @Override
    public void area() {
        super.area();
    }

 */

    @Override
    public void area() {
        System.out.println("Üçgenin alanı " + (edge*edge/4));
    }

    @Override
    public void perimeter() {
        System.out.println("Üçgenin çevresi " + (3*edge));
    }
}
