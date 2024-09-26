package java_bootcamp.part_2.exceptions;

public class J01_CheckedExceptions {


    public static void main(String[] args) {

           

exception();

    }


    public static void exception() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
    }
}
