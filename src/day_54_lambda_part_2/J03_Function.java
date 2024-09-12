package day_54_lambda_part_2;

import javax.swing.text.StyledEditorKit;
import java.util.function.Function;

public class J03_Function {

    public static void main(String[] args) {

        Function<String,Integer> lengthOfString=k->k.length();

        System.out.println(lengthOfString.apply("Adam"));

        Function<Integer, Boolean> isGreater18=k->k>=18;

        System.out.println(isGreater18.apply(12));


        Function<String,String> initials=k->{

            //Berat Erkul
            String[] words = k.split(" ");
            //1. element Berat  2. element Erkul
            return ""+ words[0].charAt(0)+ words[1].charAt(0);
                              //B                 E
        };

        System.out.println(initials.apply("Berat Erkul"));


    }
}
