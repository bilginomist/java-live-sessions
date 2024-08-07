package day_35_arraylist_part_2;

import java.util.ArrayList;
import java.util.Arrays;

public class J01_BulkOperations {

    public static void main(String[] args) {


        //        zorunlu                      isteğe bağlı
        ArrayList<String> languages=new ArrayList<String>();

        languages.add("Java");
        System.out.println(languages);
        languages.add("C#");
        System.out.println(languages);

        //tek seferde birden fazla element ekleme
        languages.addAll(Arrays.asList("Python","Ruby","Groovy","Kotlin","C++","C#","Ruby"));

        System.out.println("languages = " + languages);


        System.out.println("languages.contains(\"Ruby\") = " + languages.contains("Ruby"));

/*
        System.out.println(
                languages.contains("Javascript")
                && languages.contains("C#")
                &&languages.contains("Kotlin"));

 */

      boolean result=languages.containsAll(Arrays.asList("Script","C#","Kotlin"));

        System.out.println("result = " + result);


       // languages.remove("Ruby");

        languages.removeAll(Arrays.asList("Ruby","Java","Groovy"));

        System.out.println("languages = " + languages);
        //[C#, Python, Kotlin, C++, C#]
        //bu hariç yada bunlar hariç hepsini sil

        languages.retainAll(Arrays.asList("C#","Kotlin"));


        System.out.println("languages = " + languages);


        languages.clear();

        System.out.println("languages = " + languages);
    }
}
