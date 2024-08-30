package day_48_exception_part_1;

import java.util.Scanner;

public class J02_ExceptionHandling {

    public static void main(String[] args) {

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
