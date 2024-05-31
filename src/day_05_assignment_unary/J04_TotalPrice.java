package day_05_assignment_unary;

public class J04_TotalPrice {


    public static void main(String[] args) {

        double price=20.70;
        int quantity=6;
       //int        // int    double =double
       // quantity=(int) (quantity*price);

       // quantity*=price;

        System.out.println(quantity);

        //double  int * double
       // price=quantity*price;
        price*=quantity; //yuvarlama yok çünkü data tipi uyuşuyor

        quantity*=price; //yucvarlama var neden? sağ taraf double sol tarafa int


        System.out.println(price);


    }
}
