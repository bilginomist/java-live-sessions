package day_31_array_part_4;

public class J02_CountStrings {

    /*
    Task 2 : Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4
     */

    public static void main(String[] args) {

        String[] array={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};

        int sayac=0;
        for (String each : array) {
             //  A                 ANNA
          //  if (each.charAt(0)==each.toUpperCase().charAt(each.length()-1)){

            String ilk=""+each.charAt(0);
            String son=""+each.charAt(each.length()-1);


            if (ilk.equalsIgnoreCase(son)){
                sayac++;
            }

        }

        System.out.println("sayac = " + sayac);




    }
}
