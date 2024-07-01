package day_21_user_input;

import java.util.Scanner;

public class J05_FillForm {


    public static void main(String[] args) {
               //reference obje için
        Scanner scanner=new Scanner(System.in);
      //Class

        //Adınızı doldurun

        System.out.println("Adınızı doldurun ");
      String ad=  scanner.nextLine();

        //Soyadınızı doldurun

        System.out.println("Soyadınızı doldurun");

        String soyad=scanner.nextLine();

        //yaşınızı girin

        System.out.println("Yaşınızı giriniz");

        int age=scanner.nextInt();



        //Cinsiyet F/M

        System.out.println("Cinsiyetnizi giriniz");
        char gender=scanner.next().charAt(0);


        //Adress girin

        scanner.nextLine();

        System.out.println("Adresinizi giriniz");
        String adres=scanner.nextLine();

        System.out.println("Adınız: " +ad);
        System.out.println("Soyadınız: " +soyad);
        System.out.println("Yaşınız: " +age);
        System.out.println("Adresiniz: " + adres) ;
        System.out.println("Gender: " + gender);


        /*

        nextLİne() metodunu kullanırken eğer öncesinde nextLine yok ise
        bir tane extradan öncesine scanner.nextLine() eklenir
        sebebi ENTER tuşunu yakalamak




         */

    }
}
