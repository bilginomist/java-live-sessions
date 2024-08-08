package day_36_oop_part_1_constructor.j02;

public class PersonObj {


    public static void main(String[] args) {
        Person person1 = new Person();
      //  System.out.println(person1.isAlive);


        Person person2=new Person("Ahmet");
        System.out.println(person2.name);
        System.out.println(person2.isAlive);


    }
}
