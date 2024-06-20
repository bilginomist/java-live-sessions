package day_14_fourth_week_recap;

public class JP03_DivideWithoutSlash {

    public static void main(String[] args) {


        int num1=46;

        int num2=5;

        int counter=0;

        while (num1>0 && num1>=num2){
            num1=num1-num2;

            counter++;



        }

        System.out.println(counter);

        System.out.println(num1);

    }
}
