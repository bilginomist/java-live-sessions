package day_05_assignment_unary;

public class J08_PrePostIncDec {

    public static void main(String[] args) {
        int x=10;
        int y=22;

        //                 10  +  11  =21
        System.out.println(x++ +  x);
        //                11  +  23 =34
        System.out.println(x++ + ++y); //12



        //                 13  %5 =3
        System.out.println(++x % 5);


        String name="Adam";
        //variable yazdırmak için variable adı yazılır noktaya basılır ve sout yazılır
        System.out.println(name);

        //variable yazdırmak için variable adı yazılır noktaya basılır ve soutv yazılır
        System.out.println("name = " + name);

        int b=45;

        System.out.println("b = " + b);


    }
}
