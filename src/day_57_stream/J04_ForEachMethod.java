package day_57_stream;

import java.util.Arrays;
import java.util.List;

public class J04_ForEachMethod {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Salih X", "Yusuf Dadaş", "Adem K");

        list.stream()
                .forEach(k->
                        System.out.println(""+k.charAt(0) + k.charAt(k.indexOf(" ")+1)));


    }
}
