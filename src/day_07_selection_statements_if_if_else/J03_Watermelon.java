package day_07_selection_statements_if_if_else;

public class J03_Watermelon {


    public static void main(String[] args) {


boolean isEnough=false;

int number=40;

   //40 >=20
if (number>=20){ //true

    System.out.println("I have mote than 20 watermelons"); //I have mote than 20 watermelons
    isEnough=true;  // isEnough yeni değer true oldu
}


if (isEnough){ //true
    System.out.println("Good job"); //Good job
}


if (!isEnough){ //false

    System.out.println("I need more watermelons");
}







    }
}
