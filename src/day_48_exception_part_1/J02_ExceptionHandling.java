package day_48_exception_part_1;

import java.util.Scanner;

public class J02_ExceptionHandling {

    public static void main(String[] args) {

        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day_48_exception_part_1.J02_ExceptionHandling.main(J02_ExceptionHandling.java:11)
         */


        try {
            int num=0;

            System.out.println(10/num);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner=new Scanner(System.in);

        try {
            System.out.println("İsim Girin");
            String name= scanner.next();

            name=null;

            System.out.println(name.toLowerCase());
        }catch (NullPointerException e){

            System.out.println("Ad ile ilgili bir sorun yaşıyorum adın null olup olmadığunı kontrol edin");
        }

        System.out.println("Soyad girin");

        String lastName=scanner.next();

        System.out.println(lastName.toUpperCase());

    }
}
