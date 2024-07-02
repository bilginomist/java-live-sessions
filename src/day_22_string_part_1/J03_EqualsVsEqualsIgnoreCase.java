package day_22_string_part_1;

public class J03_EqualsVsEqualsIgnoreCase {

    public static void main(String[] args) {

        //Sınıfımızadaki arifi bana söyleyin;
        //Sınıfımızadaki Arifi bana söyleyin;

        String str1 = "Arif Gün";
        String str2 = "arif gün";

        System.out.println(str1==str2);

        System.out.println(str1.equals(str2));

        System.out.println(str1.equalsIgnoreCase(str2));


        String str4="AdaM";

        String str5="aDAm";

        System.out.println(str4.equalsIgnoreCase(str5));

        String str6="Gün";
        String str7="GÜn";

        System.out.println(str6.equalsIgnoreCase(str7));
    }
}
