package day_19_memory_mangement_system;

public class Calculator {
int buttonOne =1;
int buttonTwo =2;

    @Override
    public String toString() {
        return "Bu hesap makinasında {" +
                "buttonOne=" + buttonOne +
                ", buttonTwo=" + buttonTwo +
                '}' + "gibi tuşlar mevcuttur";
    }

    public int clickDigitButton(int number){
       // System.out.println(number);
        return number;
    }

    public int add(int a,int b){

        return a+b;
    }

    public int subtract(int a , int b){

        return a-b;
    }





}
