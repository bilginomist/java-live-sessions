package java_bootcamp;

public class J05_StringVsStringBuilderBuffer {

    public static void main(String[] args) {

        String literal="Adam";

        String newKeyword=new String("Elif");

        StringBuilder stringBuilder=new StringBuilder(literal);

       String reversed= stringBuilder.reverse().toString();

        System.out.println("reversed = " + reversed);

        //threadsa(F)e  StringBu(FF)er

    }
}
