package day_58_stream_terminal_operators;

import java.util.Arrays;
import java.util.List;

public class J01_AnyMatchMethod {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,5);

        //herhangi bir eşleşme var ise true değer türlü false
    boolean result=    list.stream()
                .anyMatch(k->k%2==0);


        System.out.println(result);

    }
}
