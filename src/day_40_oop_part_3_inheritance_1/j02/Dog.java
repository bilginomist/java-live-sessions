package day_40_oop_part_3_inheritance_1.j02;
           //Dog is an   Animal
             //is a relationship
public class Dog extends Animal {


    /*
    public Dog(){
    super();
    }
     */

               public Dog(String name, String breed, String gender, int age, String color){
                   super(name,breed,gender,age,color,4);
               }


           }
