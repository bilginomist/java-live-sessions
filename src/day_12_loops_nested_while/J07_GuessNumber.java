package day_12_loops_nested_while;

import java.util.Random;
import java.util.Scanner;

public class J07_GuessNumber {

    public static void main(String[] args) {

        Random random=new Random();

        int randomNumber= random.nextInt(10)+1;

       // System.out.println(randomNumber);

        Scanner scanner=new Scanner(System.in);


        do {
            System.out.println("Sayıyı tahmin et");
            int tahmin= scanner.nextInt();

            if (tahmin==randomNumber){
                System.out.println("Buldun");
                break;
            }


        }while (true);




    }
}
