package day_22_string_part_1;

public class J02_EqualsMethodEqualsSign {

    public static void main(String[] args) {

        String str1="Sami";
        String str2="Sami";
  //== değeri hafızada tutulduğu yere bakar
        System.out.println(str1==str2);

        String str3=new String("Sami");
        String str4=new String("Sami");

        System.out.println(str1==str3);

        System.out.println(str1+ " str1");
        System.out.println(str3+ " str3");

//equals method değerinin eşit olup olmadığına bakıyormuş
        System.out.println(str1.equals(str3));

    }
}
