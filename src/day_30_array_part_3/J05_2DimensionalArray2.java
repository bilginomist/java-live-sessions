package day_30_array_part_3;

import java.util.Arrays;

public class J05_2DimensionalArray2 {


    public static void main(String[] args) {

        //şirketi oluştur


        String[][] company=new String[2][];
        //departmanları oluştur

        String[] department1=new String[3];
        String[] department2=new String[5];

        company[0]=department1;
        company[1]=department2;

        department1[0]="Sami";
        department2[0]="Arif";

        department1[1]="Merve";
        department2[1]="Harun";


       // System.out.println(Arrays.deepToString(company));


        for (String s : department1) {
            System.out.println(s);
        }


        System.out.println("================");
        for (String s : department2) {
            System.out.println(s);
        }

        System.out.println("===================");

        for (String[] eachDepartment : company) { //iki kez

            for (String eachPerson:eachDepartment){
                System.out.println(eachPerson);
            }

            System.out.println("________________");

        }

    }
}
