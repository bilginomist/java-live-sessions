package day_10_third_week_recap;

public class JP01_Revenue {

    public static void main(String[] args) {
        //price tanımla
        double price=119.99;

        //adet tanımla
        int quantity=10;

        //toplam ödenecek miktarı bul
        double gelir=price * quantity;

        //toplma ödenecek tutar eğer 5000 liradan fazla ise
        //yüzde on indirim yap

      if(gelir>5000){
        //  double indirim=gelir*10/100; //600
          double indirim=gelir*0.1; //600
                 //6000 - 600

          System.out.println(indirim);
         // gelir=gelir-indirim;
          gelir-=indirim;
      }

        System.out.println(gelir);


        System.out.printf("%.1f",gelir);
    }
}
