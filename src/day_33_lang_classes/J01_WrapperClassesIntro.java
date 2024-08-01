package day_33_lang_classes;

public class J01_WrapperClassesIntro {


    public static void main(String[] args) {
        String ten = "10";

        System.out.println(ten + 1); //101

        //rakam olarak 10
        System.out.println(Integer.valueOf(ten) + 1);

        String decimal = "3.5";
        System.out.println(decimal + 1); //3.51

        System.out.println(Double.valueOf(decimal) + 1);
        System.out.println(Integer.MAX_VALUE);

        System.out.println("Evlimisniz");
        String cevap = "TRUE";

        boolean b1 = true; //false
        System.out.println(b1);

        System.out.println("BOOLEAN TRUE");
        System.out.println(Boolean.valueOf(cevap));


        if (Boolean.valueOf(cevap)) {
            System.out.println("String booleana dönüştü");
        }

    }
}
