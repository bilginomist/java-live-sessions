package day_45_oop_part_6_abstraction_2.j02;

public class Samsung extends Phone implements HasAndroid{


    @Override
    public void call() {
        System.out.println("Samsung");
    }

    @Override
    public void hasAndroid() {

    }
}
