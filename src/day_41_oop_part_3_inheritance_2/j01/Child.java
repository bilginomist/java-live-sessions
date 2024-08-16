package day_41_oop_part_3_inheritance_2.j01;

public class Child extends Parent{

    /*
     public void method(){
       super.method();
    }
     */

    @Override
    public void method() {
       // super.method(); //Babanın methodunu çağırma
        System.out.println("Method in child");
    }
}
