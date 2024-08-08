package day_36_oop_part_1_constructor.j04;

public class Car {

    String make;
    String model;

    double fuelLevel;

    //CONSTRUCTORDAN ÖNCE ÇALIŞIYOR VE HER OBJE CREATE EDİLMEDEN ÖNCE
    {
        this.fuelLevel=100;

        System.out.println("init block 1");
    }

    //YUKARIDAN AŞAĞI DOĞRU ÇALIŞIR
    {

        System.out.println("init block 2");
    }
    //initializer block oluştur


    public Car(String make){
        System.out.println("CONS PAR");
        this.make=make;

    }

    public Car(){
        System.out.println("CONS NON ARG");
    }


}
