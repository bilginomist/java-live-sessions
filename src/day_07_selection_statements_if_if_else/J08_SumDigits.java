package day_07_selection_statements_if_if_else;

public class J08_SumDigits {


    public static void main(String[] args) {
/*
        int num1=10;
        //10 bölümünden kalan son digti verir
        int sonRakam =num1%10;
        System.out.println(sonRakam);

        //onlar basamığandaki sayıyı bulmak için 10 böl bölüm bize bu digiti verir

        int ikinciRakam =num1/10;

        System.out.println(ikinciRakam);


        System.out.println(sonRakam+ikinciRakam);

 */



        int num2=145;

        //son basamak
        int sonBasamak=num2%10;

        int ilkBasamak=num2/100;


        System.out.println(sonBasamak);
        System.out.println(ilkBasamak);

        int ortaBasamak=num2/10%10;


        System.out.println(sonBasamak+ilkBasamak+ortaBasamak);











    }
}
