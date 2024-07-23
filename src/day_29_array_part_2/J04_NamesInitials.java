package day_29_array_part_2;

import java.util.Arrays;

public class J04_NamesInitials {

    /*
    İsimlerin içinde olduğu bir diziyi parametre olarak
    alan ve baş harflerinin içinde olduğu yeni bir diziyi geri döndüren method yazınız.
     */

    public static void main(String[] args) {

        String[] names={"Sami Mutlu", "Mehmet Akif","Gulizar Cadil","Yusuf Dadas"};

        //SM,MA,GC,YD

        /*

        A B
        C D




        ab@mycompany.com


         */


       String[] result= initialsOfNames(names);

        System.out.println(Arrays.toString(result));


    }

    public static String[] initialsOfNames(String[] names) {
        //{"Sami Mutlu", "Mehmet Akif","Gulizar Cadil","Yusuf Dadas"};
        String[] initialsOfNames=new String[names.length];

        for (int i = 0; i < names.length; i++) {
           String currentName= names[i];
         int bosluk=   currentName.indexOf(" "); //boşluğun yeri
                         //  ismin baş harfi          soysimin baş harfi
           String initials= ""+currentName.charAt(0) + currentName.charAt(bosluk+1);
                               //S                        M
            initialsOfNames[i]=initials.toLowerCase() +"@gmail.com";
        }

        return initialsOfNames;
    }


}
