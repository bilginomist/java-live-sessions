package day_21_user_input;


import java.util.Scanner;

public class J03_ScannerString {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Adınızı giriniz");

       // String ad=scanner.next(); //Sadece bir kelime gireblirsniz
        String ad=scanner.nextLine(); // istediğiniz kadar kelime


        System.out.println("Adınız " + ad);



    }
}
