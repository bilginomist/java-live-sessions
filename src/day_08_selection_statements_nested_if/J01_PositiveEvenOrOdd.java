package day_08_selection_statements_nested_if;
                         //Çift Tek
public class J01_PositiveEvenOrOdd {


    public static void main(String[] args) {

        //ilk tamsayı numara al

        int numara=-21;



        //sayının pozitf olduğun kontrole et
        if (numara>0){

            //sayı pozitif ise sayının çift yada tek olduğunu kontrol et
            //2 ye bölümünden kalan 0 ise
            if (numara%2==0){
                System.out.println("Bu sayı pozitif ve çift sayıdır");
            }else {
                System.out.println("Bu sayı pozitif ve tek sayıdır");
            }



        }else {
            //sayı pozitif değil ise o zaman da hatalı sayı diye ekrana yazdır

            System.out.println("hatalı numara");
        }













    }
}
