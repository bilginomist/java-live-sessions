package day_41_oop_part_3_inheritance_2.j02;

public class ShapeObj {


    public static void main(String[] args) {

        Triangle triangle=new Triangle();
        triangle.edge=3;
        triangle.area();

        Square square=new Square();
        square.edge=3;
        square.area();
    }
}
