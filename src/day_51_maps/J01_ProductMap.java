package day_51_maps;

import java.util.*;

public class J01_ProductMap {


    public static void main(String[] args) {

        Map<String,Double> products=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        products.put("Elma",4.56);
        products.put("Kiraz",3.0);
        products.put("Muz",4.0);
        products.put("Erik",5.0);
        products.put("Karpuz",7.0);


        System.out.println(products);

        System.out.println(products.size());


        System.out.println(products.containsKey("elma"));

        System.out.println(products.containsValue(5.0));

        System.out.println(products.get("elma"));

        Set<String> productNames = products.keySet();

        System.out.println(productNames);


        System.out.println(products.keySet());

        System.out.println(products.values());

    }
}
