package day_14_fourth_week_recap;

public class JP02_Triangle {

    public static void main(String[] args) {
/* //1. satır
        System.out.print("#");
        System.out.print("");
        System.out.print("#");

//2. satır
        System.out.println();
        System.out.print("#");
        System.out.print(" ");
        System.out.print("#");

//3. satır
        System.out.println();
        System.out.print("#");
        System.out.print("  ");
        System.out.print("#");

//4. satır
        System.out.println();
        System.out.print("#");
        System.out.print("   ");
        System.out.print("#");
*/

        for (int i = 1; i <=7; i++) {

            System.out.print("#");

            for (int j = 1; j <i ; j++) {
                System.out.print(" ");
            }

            System.out.print("#");

            System.out.println();
        }




    }
}
