package day_05_assignment_unary;

public class J00_SwapTwoNumber {

    public static void main(String[] args) {


        int bardak1=10; //10 birim su
        int bardak2=20; //20 birim gazoz
        System.out.println(bardak1);
        System.out.println(bardak2);
        System.out.println("Yer değiştikten sonraki değerler");
        int bosbardak=0;

        bosbardak=bardak1;  //boş bardak 10 brim su ile doldu
        bardak1=bardak2; //bardak 1 de artık 20 birim gazoz
        bardak2=bosbardak; //10 birim suyu bardak 2 ye koydu

        System.out.println(bardak1);
        System.out.println(bardak2);


    }
}
