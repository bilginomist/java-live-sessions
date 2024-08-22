package day_44_oop_part_5_abstraction_1.j02;

public class Adam extends Calculator{


    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int multiply(int a, int b) {
        return a+b;
    }

    @Override
    public int divide(int a, int b) {
        return 0;
    }
}
