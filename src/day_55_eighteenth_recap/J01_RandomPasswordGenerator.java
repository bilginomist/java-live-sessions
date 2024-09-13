package day_55_eighteenth_recap;

import java.util.Random;
import java.util.function.Supplier;

public class J01_RandomPasswordGenerator {


    public static void main(String[] args) {
        String password="";
        int countOfChar=16;

        for (int i = 0; i < countOfChar; i++) {
                                                      // 0 ile 104 dahil random sayı üretiyor
            Supplier<Character> randomChar=()->(char)(   new Random().nextInt(105)              +34);

            password+=randomChar.get();

        }


        System.out.println(password);


    }
}
