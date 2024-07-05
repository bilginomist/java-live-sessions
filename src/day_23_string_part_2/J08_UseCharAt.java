package day_23_string_part_2;

import java.util.Scanner;

public class J08_UseCharAt {

    public static void main(String[] args) {

        //Kelime dışarıdan alıncak
        System.out.println("Bir kelime girniz");
        Scanner scanner=new Scanner(System.in);

        String word= scanner.next();


        //karekterler tek tek alınacak

         //        word.length()-1
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+ " ");
        }

        //araasına boşluk koy









    }
}
