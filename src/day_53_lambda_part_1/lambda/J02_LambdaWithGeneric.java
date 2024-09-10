package day_53_lambda_part_1.lambda;

public class J02_LambdaWithGeneric {


    public static void main(String[] args) {
        /*
        LAMBDA FORMUL

         (t,k) ->  {statement 1 , statement 1}
         t -> {statement 1 , statement 1}
         t->  statement 1


         */

            // 1. param 2. param  dönüş tip
        Combine<String,String,    String> stringCombine=(t,k)-> t+k;

        String accept = stringCombine.accept("Ali", "Veli");

        System.out.println(accept);

      //  Combine<Integer,Integer,Integer> integerCombine=(t,k)-> {return (t+k);};
        Combine<Integer,Integer,Integer> integerCombine=(a,b)->a+b;


        Integer accept1 = integerCombine.accept(5, 4);

        System.out.println(accept1);
    }

}
