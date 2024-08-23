package day_45_oop_part_6_abstraction_2.j02;

public class Iphone extends Phone implements HasIOS{
    @Override
    public void call() {
        System.out.println("Iphone arıyor");
    }


    @Override
    public void hasIOS() {
        System.out.println("IPHONE HAS IOS");
    }
}
