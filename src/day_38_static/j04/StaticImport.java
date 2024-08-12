package day_38_static.j04;


                       //statik methodlar ve fieldlar
//Class içerisindeki tüm statik alanlar import edildi
import java.util.Arrays;
import java.util.Collections;

import static day_16_methods_part_2.J01_WhyReturnMethod.*;
import static java.lang.Math.*;
import static java.util.Collections.*;

public class StaticImport {

    //PI
    //min
    //max

    public static void main(String[] args) {

        System.out.println("Math.PI = " + PI);

        System.out.println(max(5, 6));

        System.out.println("min(4,5) = " + min(4, 5));
        //PI=180
        System.out.println("cos(0.5) = " + cos(PI / 3));

        System.out.println(tan(PI / 4));

        multiplyResultWithAnyNumber(30, 2);
        addTwoNumbersAndReturn(2, 3);


    }
}
