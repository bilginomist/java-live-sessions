package day_11_loops_for_loop;

public class J07_PrintAlphabetAToZ {

    public static void main(String[] args) {
        //harfleri a dan z ye kadar yazdır

        for (int i = 97; i <=122 ; i++) {
            char letter=(char) i;
            System.out.println(letter);

        }
        System.out.println("================");

        for (char i = 'a'; i <='z' ; i++) {
            System.out.print(i);
            if (i != 'z') {

                System.out.print(", ");
            }

        }
        
    }
}
