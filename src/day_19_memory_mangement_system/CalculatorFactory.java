package day_19_memory_mangement_system;

public class CalculatorFactory {


    public static void main(String[] args) {

        Calculator calculator1=new Calculator();

     int result=   calculator1.add(calculator1.clickDigitButton(3), calculator1.clickDigitButton(3));

        System.out.println(result);

                                //1      ,      2
        calculator1.add(calculator1.buttonOne,calculator1.buttonTwo);


        System.out.println(calculator1);
    }
}
