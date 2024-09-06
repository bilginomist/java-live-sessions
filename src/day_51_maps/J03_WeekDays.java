package day_51_maps;

import java.util.Map;
import java.util.TreeMap;

public class J03_WeekDays {


    public static void main(String[] args) {
           // KEY     VALUE
        Map<Integer,String> daysTurkey=new TreeMap<>();
        daysTurkey.put(1,"Pazartesi");
        daysTurkey.put(2,"SAlı");
        daysTurkey.put(3,"Çar");
        daysTurkey.put(4,"Per");
        daysTurkey.put(5,"Cuma");
        daysTurkey.put(6,"Cumar");
        daysTurkey.put(7,"Pazar");

        Map<Integer,String> daysABD=new TreeMap<>();
        daysTurkey.put(2,"Pazartesi");
        daysTurkey.put(3,"SAlı");
        daysTurkey.put(4,"Çar");
        daysTurkey.put(5,"Per");
        daysTurkey.put(6,"Cuma");
        daysTurkey.put(7,"Cumar");
        daysTurkey.put(1,"Pazar");

        System.out.println("daysTurkey.get(1) = " + daysTurkey.get(1));

        daysTurkey.clear();

        System.out.println("daysTurkey = " + daysTurkey);

    }
}
