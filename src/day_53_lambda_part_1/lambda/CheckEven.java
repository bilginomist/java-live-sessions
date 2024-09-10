package day_53_lambda_part_1.lambda;

public class CheckEven implements IsEven{


    @Override
    public void test(int a) {
        System.out.println(a%2==0);
    }
}
