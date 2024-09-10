package day_53_lambda_part_1.lambda;

@FunctionalInterface
public interface Combine<T,K,R> {

   R accept(T first,K second);
}
