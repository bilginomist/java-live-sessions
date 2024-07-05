package day_23_string_part_2;

public class J09_GetLettersAndSpace {


    public static void main(String[] args) {

       // String word="Y+%+^%o^+%^+%u^%+%^ a'^+'r=?*+'^+'e*^ p^'+'^**/*e/*/*r64654f5468*///*e--c*04*50t";

        String word="Adam";
        //Verilen stringdeki harfleri ve boşlukları alan ve
        // yeni bir string yapan programı yazınız

        //cfco
        //ADAM
        String result="";

        for (int i = 0; i < word.length(); i++) {

            int each = word.charAt(i);

            System.out.println(each);
/*
            if ((each>='a' && each<='z') || (each>='A' && each<='Z') || each==' '){
              //  result += each;

                result=result+each;
            }

 */

        }

        System.out.println(result);


    }
}
