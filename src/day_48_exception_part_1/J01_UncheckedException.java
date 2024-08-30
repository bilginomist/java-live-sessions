package day_48_exception_part_1;

import java.util.ArrayList;

public class J01_UncheckedException {

    public static String a;
    public static void main(String[] args) {
        //ArithmeticException

        /*
        for (int i = 10; i >=0 ; i--) {
            System.out.println(20/i);
        }


         */

        //NullPointerException
        //String b=null;
        //System.out.println(a.substring(0));
                             // 5   8
        String sentence="Sepette 10 elma var";

        int firstSpace = sentence.indexOf(" ");
        int elmaninYeri = sentence.indexOf("elma");

        //NumberFormatException
        String elmaSayisi=sentence.substring(firstSpace,elmaninYeri);


       // System.out.println(Integer.parseInt(elmaSayisi)+5);

        String name="Adam";

       // System.out.println(name.charAt(5));


        ArrayList<String> arrayList=new ArrayList<>();

       // System.out.println("arrayList.get(3) = " + arrayList.get(3));

                   //String
        Object a="232";

        //System.out.println((Integer) a);

        AParent aChild=new AChild();

     //   System.out.println((Achild2)aChild);




    }
}
