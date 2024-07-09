package day_25_string_part_4;

public class J05_MutableVersionOfString {

    public static void main(String[] args) {

        String string=new String("Adam"); //bana string objesi oluşturdu  Adam

        string.concat("12"); //string="Adam"

        System.out.println("After concat string değeri = " +string );
        System.out.println(string.substring(0, 2)); //string=Adam
        System.out.println(string);

        System.out.println("String builder");

        StringBuilder stringBuilder=new StringBuilder("Ad"); //string objesi oluşturdu Adam



        System.out.println("stringBuilder before append= " + stringBuilder); //Ad
       stringBuilder.append("am"); //reassign etmedim stringBuilder=Adam
        System.out.println("stringBuilder after append = " + stringBuilder);//Adam

        stringBuilder.append("12"); //stringBuilder=Adam12

        System.out.println(stringBuilder.reverse());

        String ad1="Samir";
        String ad2="Adamk";
        String ad3="Arifi";
                           //son harfin index
        ad1=ad1.substring(0,ad1.length()-1);

        System.out.println("ad1 = " + ad1);



        StringBuilder stringBuilder1=new StringBuilder(ad2);
        stringBuilder1.deleteCharAt(ad2.length()-1);

        System.out.println("stringBuilder1 = " + stringBuilder1);
                  // 0123
        String name="Sami";


        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }

        StringBuilder stringBuilder2=new StringBuilder(name);
        System.out.println("stringBuilder2.reverse() = " + stringBuilder2.reverse());


        StringBuffer stringBuffer=new StringBuffer("Adam");


    }
}
