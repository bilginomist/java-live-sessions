package day_58_stream_terminal_operators;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class J04_FindAnyMethod {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(6,4);

        Optional<Integer> any = list.stream()
                .findAny();

        any.ifPresent(k-> System.out.println(k));


    }
}
