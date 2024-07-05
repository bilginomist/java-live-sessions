package day_23_string_part_2;

public class J03_ToUpperCase {

    public static void main(String[] args) {

        String word = "elma";
             // "elma"  //ELMA
      word=  word.toUpperCase();

        String result="";

        //kelime havuzum
        switch (word) {

            case "ELMA":
                result = word;
                break;

            case "ERİK":

                result = word;
                break;

            default:
                result="ARADIĞINIZ KELİME YOK";

        }

        System.out.println(result);

        //  String word1="Kiraz";
        //  System.out.println(word1.toUpperCase(Locale.forLanguageTag("tr-TR")));


    }
}
