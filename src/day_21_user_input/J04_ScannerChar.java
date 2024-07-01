package day_21_user_input;

import java.util.Scanner;

public class J04_ScannerChar {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Cinsiyetinizi F / M olarak belirtin");

      char gender=scanner.next().charAt(0);


        System.out.println("Gender : " + gender);




    }
}
