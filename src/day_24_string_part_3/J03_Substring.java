package day_24_string_part_3;

public class J03_Substring {

    public static void main(String[] args) {

                 // 01234567
        String str="SENTENCE";
                    //son index dahil değil
    String sub=    str.substring(3,6);

        System.out.println("sub = " + sub);
                                                    //  42         54
        String result="Yaklaşık 5.190.000 sonuç bulundu (0,33 saniye)";

        int indexOfFirstPar=result.indexOf("(");
        int indexOfLastPar=result.lastIndexOf(")");

     String seconds=   result.substring(indexOfFirstPar+1,indexOfLastPar);

        System.out.println("seconds = " + seconds);


    }
}
