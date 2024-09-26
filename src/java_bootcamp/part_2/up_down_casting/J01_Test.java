package java_bootcamp.part_2.up_down_casting;

public class J01_Test {

    public static void main(String[] args) {

        Parent parent=new Child(); //auto done by compiler

        //down casting
        ((Child) parent).childMethod();



    }
}
