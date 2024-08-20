package day_42_oop_part_4_inheritance_3.super_keyword.cons;

public class TestObj {

    public static void main(String[] args) {

        Parent parent=new Parent("Adam",34);

        Child child=new Child(
                "Mike"
                ,9
                ,true);

        System.out.println(parent.age);
        System.out.println(parent.name);

        System.out.println(child.name);
        System.out.println(child.age);
        System.out.println(child.havingTeeth);

    }
}
