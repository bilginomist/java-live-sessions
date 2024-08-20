package day_42_oop_part_4_inheritance_3.super_keyword.cons;

public class Child extends Parent{

    /*
    public Child(){

    //parenttaki consu çağır
    super();
    }
     */
   public boolean havingTeeth;


    public Child(String name,int age,boolean havingTeeth){
        super(name,age);
        this.havingTeeth=havingTeeth;
    }




}
