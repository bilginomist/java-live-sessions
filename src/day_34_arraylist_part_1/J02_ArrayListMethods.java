package day_34_arraylist_part_1;

import java.util.ArrayList;

public class J02_ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        //print list

        System.out.println(list);

        //listeye bir şey ekle

        list.add("Yumurta"); //ilk sıraya
        list.add("Kaşar");  //ikinci sıraya

        System.out.println(list);

        list.add("Sucuk");
        list.add("Zeytin");

        System.out.println("Sucuk ve zeytin eklendikten sonra");

        System.out.println(list);
         //   0       1      2       3
        //[Yumurta, Kaşar, Sucuk, Zeytin]

        list.add(2,"Bal");

        System.out.println("Balı üçüncü sıraya ekledikten sonra");
        System.out.println(list);


        //eğer listin içindeki eleman sayısı lazımsa

        System.out.println("list.size() = " + list.size());


        //istenilen indexteki elemanı alma

        System.out.println("list.get(0) = " + list.get(0));

        System.out.println("list.get(list.size()-1) = " + list.get(list.size()-1));


       // System.out.println(list.get(12));
          //  0        1     2    3       4
        //[Yumurta, Kaşar, Bal, Sucuk, Zeytin]

        //istenilen elementi güncelleme



        list.set(3,"Afyon Sucuk");
        System.out.println(list);


        //System.out.println("list.remove(\"Kaşar\") = " + list.remove("Kaşar"));

       // System.out.println("list.remove(3) = " + list.remove(3));

        list.add("Yumurta");
        System.out.println(list);

        System.out.println("list.indexOf(\"Yumurta\") = " + list.indexOf("Yumurta"));


        System.out.println("list.lastIndexOf(\"Yumurta\") = " + list.lastIndexOf("Yumurta"));

        System.out.println(list);


        System.out.println("list.indexOf(\"Afyon Sucuk\") = " + list.indexOf("Afyon Sucuk"));
        System.out.println("list.lastIndexOf(\"Afyon Sucuk\") = " + list.lastIndexOf("Afyon Sucuk"));


      //  if (list.indexOf("Kaşar")== list.lastIndexOf("Kaşar"))//eşsiz

        System.out.println("list.contains(\"Zeytin\") = " + list.contains("Zeytin"));


        System.out.println("list = " + list);


        //bütün elemanları sil
        list.clear();

        //liste boşmu dolumu kontrol et true=boş
        System.out.println("list.isEmpty() = " + list.isEmpty());






    }
}
