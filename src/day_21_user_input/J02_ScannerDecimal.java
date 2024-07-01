package day_21_user_input;

import java.util.Scanner;

public class J02_ScannerDecimal {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Birinci numarayı girin");

        double number1= scanner.nextDouble();


        System.out.println("İkinci numarayı girin");

        double number2=scanner.nextDouble();


        System.out.println("Girdiğiniz değerler toplamı: " + (number2+number1));










    }
}
