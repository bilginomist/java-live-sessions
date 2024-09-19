package day_58_stream_terminal_operators;

import java.util.Arrays;
import java.util.List;

public class J02_NoneMatchMethod {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2,4,6);

    boolean result=    list.stream()
            //hiç tek eleman yok ise true dön yoksa false
            //hepsi çift ise true else false
                .noneMatch(k->k%2!=0); // 0 eleman geçti diğer hiç bir eleman buraya geçemedi

        System.out.println(result);

    }
}
