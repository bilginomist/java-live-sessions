package day_13_branching_statements;

public class J05_FinRa {


    public static void main(String[] args) {


        /*


        5* 7 = 5 + 5 + 5 + 5 + 5+ 5 + 5

         */
        //bir tane bitiş number al
        int end = 20;

        //baslangıç noktası seç
        int start = 1;

        //while döngüsü lazım
        while (start <= end) {



            //sayı 3 e ve 5 e bölünüyorsa "FINRA" yaz
            if (start % 3 == 0 && start % 5 == 0) {

                System.out.println("FINRA");
            }
            //sayı sadece 3   ""    "FIN" yaz
            else if (start % 3 == 0) {
                System.out.println("FIN");
            }
            //sayyı sadece 5  ""    "RA" yaz
            else if (start % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(start);
            }



            start++;

        }


    }
}
