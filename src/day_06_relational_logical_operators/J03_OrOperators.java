package day_06_relational_logical_operators;

public class J03_OrOperators {


    public static void main(String[] args) {

        System.out.println(false | false);
        System.out.println(false | true);
        System.out.println(true | false);
        System.out.println(true | true);

        System.out.println(true | false | false | false);

        System.out.println(false | false | false |false |true);


        System.out.println(true || false || false );
        System.out.println(false || true || false );



        int b=20;

        boolean result= true || b++<20;

        System.out.println(b);

        System.out.println(false || true || true);

        /*

       ÇİFT AND de ilk hareket yanlış ise yani false ise gerisine bakılmaz false olur

       ÇİFT OR da ilk hareket doğru ise yani true ise gerisine bakılmaz true olur

*/


    }
}
