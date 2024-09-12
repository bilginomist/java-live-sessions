package day_54_lambda_part_2;


@FunctionalInterface
public interface Calculator<T,K,R> {

    R calculate(T param1,K param2);

}
