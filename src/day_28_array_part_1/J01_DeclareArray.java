package day_28_array_part_1;


import java.util.Arrays;

public class J01_DeclareArray {


    public static void main(String[] args) {


        int [] scores;

        //diziler oluşturulurken ne kadar yer lazım söylenmesi gerekiyor
        scores=new int[3];

      //  int [] array=new  int[4];


       // int mat1=90;
        scores[0]=90;
      //  int mat2=80;
        scores[1]=80;
        //int mat3=100;
        scores[2]=100;

     //   System.out.println(scores);
        System.out.println(Arrays.toString(scores));


        //birinci değeri yazdır
        System.out.println(scores[0]); //90

        //üçüncü değeri yaz
        System.out.println(scores[2]); //100


        //=====================================

        System.out.println("==============================");

                       //  0       1      2       3
        String [] names={"Sami","Bedia","Arif","Bengul"};

                //     0 1 2 3 4
        int[] numbers={1,2,3,4,5};


        System.out.println(Arrays.toString(numbers));

        System.out.println(names[2]);

        /*
        //bu şekilde tanımlama yapılmaz
        long [] nums;

        nums={1,2,3,4};

         */

    }
}
