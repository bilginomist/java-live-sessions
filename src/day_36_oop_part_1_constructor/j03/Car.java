package day_36_oop_part_1_constructor.j03;

public class Car {

    String make;
    String model;
    double price;

    String color;

    boolean isFuel;

    //Cons overloading
    public Car(String make, String model, double price, String color, boolean isFuel) {
       /* this.model = model;
        this.make = make;
        this.isFuel = isFuel;

        */


        this(make,model,isFuel);
        this.price = price;
        this.color = color;


    }

//Bİr consdan diğer bir consun çağrılamsına cons chaining diyoruz
    public Car(String make, String model, boolean isFuel) {

        this(isFuel);  //CONSTRUCTOR CALL HER ZAMAN İLK SATIRDA OLACAK
        this.make = make;
        this.model = model;
       // this(isFuel); //BURADA KULLANMA
        // this.isFuel = isFuel;
        //color=null
        //price=0.0
    }


    public Car(){

    }



    public Car(boolean isFuel){
        this.isFuel=isFuel;

    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isFuel=" + isFuel +
                '}';
    }
}
