package day_41_oop_part_3_inheritance_2.j02;

public class Square extends Shape{
/*
    @Override
    public void area() {
        super.area();
    }

 */

    @Override
    public void area() {
        System.out.println("Kare alan hesabı: "+  (edge*edge));

    }

/*
    @Override
    public void perimeter() {
        super.perimeter();
    }

 */

    @Override
    public void perimeter() {
        System.out.println("Kare çevresi " + (4*edge));
    }
}
