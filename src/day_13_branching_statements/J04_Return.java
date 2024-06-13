package day_13_branching_statements;

public class J04_Return {


    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if (i==3){
               // continue;
                /*
                0
1
2
4
5
6
7
8
9
Main methoddayım
                 */
               // break;
                /*
                0
1
2
Main methoddayım

                 */
                return;
                /*
                0
                1
                2
                 */
            }
            System.out.println(i);
        }

        System.out.println("Main methoddayım");  //break en son imleci buraya taşımıştı


    } //return imleci buraya atar


}
