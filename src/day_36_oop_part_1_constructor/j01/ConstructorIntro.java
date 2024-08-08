package day_36_oop_part_1_constructor.j01;

public class ConstructorIntro {


    String name;   //null
    int age;       //0
    /*

    //default constructor
    public ConstructorIntro(){

    }

     */

    //non argument cons
    public ConstructorIntro(){

        this.name="Ahmet";
        this.age=10;
        System.out.println("No Arg Cons called");

    }

    //public olarak kullanın
    public ConstructorIntro(String name,int age){

        this.age=age;
        this.name=name;

        System.out.println("Parameterized cons called");



    }
    public static void main(String[] args) {


        ConstructorIntro obj=new ConstructorIntro();
       // obj.name="Ahmet";
       // obj.age=10;
        ConstructorIntro obj1=new ConstructorIntro();
      //  obj1.name="Ahmet";
        obj1.age=20;

        System.out.println(obj.name);
        System.out.println(obj.age);

        System.out.println(obj1.name);
        System.out.println(obj1.age);


        ConstructorIntro obj3=new ConstructorIntro("Mehmet",20);

        System.out.println(obj3.name + " " +obj3.age);




    }
}
