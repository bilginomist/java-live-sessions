package day_38_static.j01;

public class Circle {
   //instance variable
   public  double radius;

   //bütün objeler için ortak
   public    static double pi=3.14;

   public  Circle(double radius) {
      this.radius = radius;
   }

   @Override
   public String toString() {
      return "Circle{" +
              "radius=" + radius +
              '}';
   }
}
