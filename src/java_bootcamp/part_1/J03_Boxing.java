package java_bootcamp.part_1;

public class J03_Boxing {

    public static void main(String[] args) {

        //Boxing

        int num = 10;

        Integer boxing = Integer.valueOf(num); //primitive valueof methodu ile kutulamış

        //Autoboxing
        Integer autoBoxing = num;


        Integer num2 = 10;
        int unboxing = num2.intValue(); //unboxing

        int autoUnboxing = num2;  // Auto Unboxing


    }
}
