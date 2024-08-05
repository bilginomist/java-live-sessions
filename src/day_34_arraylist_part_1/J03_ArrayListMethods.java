package day_34_arraylist_part_1;

import java.util.ArrayList;

public class J03_ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);


        System.out.println("numbers = " + numbers);

/*
        for (int i = 0; i < numbers.size(); ) { //2

            numbers.remove(0);
        }

        System.out.println(numbers);


 */
        //REMOVE METHODU FOR İLE KULLANMAK MANTIKLI DEĞİL HATALI OSNUÇ ÜRETME RİSKİ BÜYÜK


        //10 20 30 40
        numbers.removeIf(e -> e<30);


        System.out.println(numbers);



        ArrayList<String> isimler=new ArrayList<>();
        isimler.add("Hamit");
        isimler.add("Mustafa");
        isimler.add("Emir");
        isimler.add("Salih");
        isimler.add("Mehmet");
        isimler.add("     ");
        System.out.println("isimler = " + isimler);
                               //  sonuç boolean
        isimler.removeIf(e->e.isBlank());

        System.out.println("isimler = " + isimler);


        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);
       // nums.remove(3); //4

                       //obje olan  3 ü yok et
        nums.remove(Integer.valueOf(13));

        System.out.println(nums);



    }
}
