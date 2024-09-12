package day_54_lambda_part_2;

public class CalculatorTest {


    public static void main(String[] args) {


        Calculator<Integer,Integer,Integer> add=(k,l)->(k+l);

        System.out.println(add.calculate(5, 6));

        Calculator<Integer,Integer,Integer> substract=(k,l)->(k-l);

        System.out.println(substract.calculate(65, 35));


    }
}
