package day_04_arithmetic_operators;

public class J03_AssignmentOperator {

    public static void main(String[] args) {

        //Data type data adını
        int chairs = 40;


        System.out.println("chairs" + 2); //chairs2
        // 40    + 2 =42
        System.out.println(chairs + 2);  //42

        //           40   + 5=45
        int moreChairs = chairs + 5;
        //45
        System.out.println(moreChairs);
                                //  string   //int       //int
       // String moreAndMoreChairs =    ""+   moreChairs +    5;
        String moreAndMoreChairs =      moreChairs +    5 + "";

        System.out.println(moreAndMoreChairs);
        /*
        "" + 45 + 5
        string
        45      + 5
        455 --> string numara değil
         */

        String yirmi = 20 + "";

        // string + numara
        System.out.println(yirmi + 5);


         String otuz="30";
       // int otuz = 30;
        System.out.println(otuz + 5);


    }
}
