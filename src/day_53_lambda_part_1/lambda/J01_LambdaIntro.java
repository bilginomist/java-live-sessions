package day_53_lambda_part_1.lambda;

public class J01_LambdaIntro {

    public static void main(String[] args) {

        /*
        CheckEven checkEven=new CheckEven();
        checkEven.test(2);

         */


        IsEven isEven=(k)->{ System.out.println(k%2==0);};

        isEven.test(2);


        Square sq=l->System.out.println(l*l);


        sq.square(4);


    }


}
