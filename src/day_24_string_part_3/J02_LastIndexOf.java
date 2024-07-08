package day_24_string_part_3;

public class J02_LastIndexOf {

    public static void main(String[] args) {
                  //012345678
        String str="Bilginomist";

        int indexOfFirstI=str.indexOf("i");

        int indexOfSecondI=str.indexOf("i",indexOfFirstI+1);

        int indexOfThirdI=str.indexOf("i",indexOfSecondI+1);

        System.out.println("indexOfThirdI = " + indexOfThirdI);

        int indexOfLastI=str.lastIndexOf("i");

        System.out.println("indexOfLastI = " + indexOfLastI);


    }
}
