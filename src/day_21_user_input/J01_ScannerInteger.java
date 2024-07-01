package day_21_user_input;


import java.util.Scanner;

public class J01_ScannerInteger {


    public static void main(String[] args) {

        //Scanner kullanmak için önce obje oluştur

        //Referans tipi refereans adı = new ReferansTipi();


        Scanner scanner=new Scanner(System.in);
                //input
                //keyboard

        //byte

        System.out.println("Yaşını gir");

        //byte b=3;
                           //klavyeden -128 - 127
        byte b= scanner.nextByte();
        System.out.println("Yaşınız " + b);


        System.out.println("İçinde bulunduğunuz yılı girin");

        short s=scanner.nextShort();

        System.out.println("Girdiğiniz yıl : " + s);


        int i=scanner.nextInt();


        long l=scanner.nextLong();





    }
}
