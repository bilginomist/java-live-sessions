package day_36_oop_part_1_constructor.j04;

public class CarObj {


    public static void main(String[] args) {

        Car car1=new Car();

        System.out.println(car1.fuelLevel); //100


        Car car2=new Car("Audi");

        System.out.println("car2.fuelLevel = " + car2.fuelLevel);

    }
}
