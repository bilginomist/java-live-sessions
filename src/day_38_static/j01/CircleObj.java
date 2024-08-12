package day_38_static.j01;

public class CircleObj {


    public static void main(String[] args) {



        Circle circle1=new Circle(5);

        //Circle.pi=3;
        System.out.println(circle1.radius);
        System.out.println(circle1.pi); //3.14

        //staikler class ismi ile çağrılır
       // System.out.println(Circle.pi);


        Circle circle2=new Circle(4);

        System.out.println(circle2.pi);


        //circle1.pi=3;
        Circle.pi=3;

        System.out.println("circle1.pi = " + circle1.pi);

        System.out.println("circle2.pi = " + circle2.pi);


    }
}
