package day_30_array_part_3;

import java.util.Arrays;

public class J04_2DimensionalArray {


    public static void main(String[] args) {
                            // 0   1
        String[] department1={"A","B"};
        String[] department2={"C","D"};
        String[] department3={"E","F"};
        String[] department4={"G","H"};
        String[] department5={"I","J"};
        String[] department6={"K","L"};

        System.out.println(Arrays.toString(department1));

                           //  0            1           2
        String[][] company1={department1,department2,department3};
                            //  String[]   String[]

        System.out.println(Arrays.deepToString(company1));
        String[][] company2={department4,department5,department6};


        String[][][] holding={company1,company2};
                              //String[][]


        System.out.println(Arrays.deepToString(holding));

                //0                          //1




        //[[[A, B], [C, D], [E, F]], [[G, H], [I, J], [K, L]]]
          //ilk companyi yazdır
        System.out.println(Arrays.deepToString(holding[0]));

        //ilk şirketteki ikinci departmanda çalışanlar

        System.out.println(Arrays.deepToString(holding[0][1]));


        //ikinci şirketteki ikinci depatmanda brinici adam

        System.out.println(holding[1][1][0]);



    }
}
