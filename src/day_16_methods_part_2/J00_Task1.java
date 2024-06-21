package day_16_methods_part_2;

public class J00_Task1 {


    public static void main(String[] args) {

        drawRoof();
        drawMultipleStorey(5);



    }

   public static void drawMultipleStorey(int numberOfStorey){

       for (int i = 1; i <=numberOfStorey ; i++) {
       drawStorey();
       }


   }

    public static void drawStorey() {
        System.out.println("*********");
        System.out.println("*       *");
        System.out.println("*       *");
        System.out.println("*********");

    }

    public static void drawRoof() {
        System.out.println("    *    ");
        System.out.println("   * *   ");
        System.out.println("  *   *  ");
        System.out.println(" *     * ");
        System.out.println("*********");

    }

}
