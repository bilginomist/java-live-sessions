package day_36_oop_part_1_constructor.j03;

public class CarObjects {


    public static void main(String[] args) {

        //bir araba yapacağız
        Car car1=new Car();

        System.out.println(car1);

        //Bir sıvı yakıtlı araba yaapcağız

        Car car2=new Car(true);

        System.out.println(car2);


        //Markası TOGG modeli T10x elektrikli araba yapacağız

        Car car3=new Car("TOGG","T10X",false);

        System.out.println(car3);

        car3.color="White";

        System.out.println(car3);

        Car car4=new Car("Audi","Q7",10000,"Red",false);








    }
}
