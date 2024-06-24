package day_17_method_overloading;

public class J04_Calculator {


    public static void main(String[] args) {


     String result=   calculate(15,6,'*');

        System.out.println(result);

    }

    public static String calculate(int number1,int number2,char operator){

        switch (operator){

            case '+':
                return "Sonuc : " + (number1+number2);

            case '-':
                return "Sonuc : " + (number1-number2);

            case '*','x':
                return "Sonuc : " + (number1*number2);

            case '/',':','÷':

               if (number2==0){
                   return "Hata : Sıfıra bölme yapılamaz";
               }else {
                   return "Sonuc : " + (number1/number2);
               }

            case '%' :

                return "Sonuc : " + (number1%number2);

            default:
                return "Geçersiz operator";

        }


    }
}
