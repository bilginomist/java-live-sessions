package day_36_oop_part_1_constructor.j02;

public class Person {


    String name;
    int age;
    String job;
    boolean isAlive;


    public Person(){
        this.isAlive=true;
    }

   // public Person(String childName){
    public Person(String name){
        this.isAlive=true;
      //  name=childName;
        this.name=name;
    }
}
