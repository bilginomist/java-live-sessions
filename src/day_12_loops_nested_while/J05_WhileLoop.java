package day_12_loops_nested_while;

public class J05_WhileLoop {


    public static void main(String[] args) {

        for (int i = 1; i <=11; i++) {

            System.out.println(i);
        }


        int num=1;
        while (true) {


            System.out.println(num++); //4


            if (num==5){
                break;
            }
        }


    }
}
