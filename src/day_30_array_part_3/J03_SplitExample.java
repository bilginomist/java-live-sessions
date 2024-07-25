package day_30_array_part_3;

public class J03_SplitExample {


    public static void main(String[] args) {

        String word = "ADam"; //AdAm
        String[] letters = word.split(""); //a , d , a ,m

        String result="";
        for (int i = 0; i < letters.length; i++) {
            if (i%2==0){
                // string
                result+=letters[i].toUpperCase();
            }else {
                result+=letters[i].toLowerCase();
            }

        }

        System.out.println(result);

    }
}
