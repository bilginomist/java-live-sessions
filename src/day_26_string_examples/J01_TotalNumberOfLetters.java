package day_26_string_examples;

import java.util.Scanner;

public class J01_TotalNumberOfLetters {

    public static void main(String[] args) {

        //Dışarıdan bilgi almam gerekir
        Scanner scanner=new Scanner(System.in);

        //Adlığım ad için bir variable tanımlamam lazım
        System.out.println("Adınızı giriniz");

        String name= scanner.nextLine();



        System.out.println("name = " + name);
        name=name.replace(" ","");
        //Aldığım soyad için bir variable lazım
        System.out.println("soyadınız girin");
        String lastName= scanner.next();

        System.out.println("lastName = " + lastName);
        //aldığım ad değernideki harf sayısnı veren bir yol lazım
       int lengthOfName=name.length();

        //aldığım soyad değernideki harf sayısnı veren bir yol lazım
        int lengthOfLastName=lastName.length();


        //sonda bunların toplamını print ettireceğim

        System.out.println("Adınız ve soyadınızdaki toplam karekter sayısı "+(lengthOfName+lengthOfLastName));

        scanner.close();

    }
}
