package day_05_assignment_unary;

public class J06_IncrementDecrement {

    public static void main(String[] args) {

        int a=5;

        //eğer ++ veya -- önde is hemen değeri artır ve azalt sonra işlem yap demek istiyor

        System.out.println(++a); //a'nın içerisinde 6 var

        System.out.println(++a); //a=7


        System.out.println(--a); //6 yazar a=6

        System.out.println(--a); //a=5


        // eğer ++ veya -- sayıdan sonra ise önce yapacağını yap sonra değerimi azaltır yada artırırsın


        int b=10;

        System.out.println(b++);//10 yazdır b=11


        System.out.println(b++);//11 yazdır b=12

        System.out.println(b--);//12 yazdır b=11

        System.out.println(b--);//11 b=10

        System.out.println(b--);//10 9

        System.out.println(b);

    }

}
