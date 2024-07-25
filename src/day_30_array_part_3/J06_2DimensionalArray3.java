package day_30_array_part_3;

public class J06_2DimensionalArray3 {

    public static void main(String[] args) {

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


        for (int i = 0; i < department2.length; i++) {
            System.out.println(department2[i]);
        }

        System.out.println("=============");
        //birinci dep birinci kişi

        System.out.println(company[1][2]);


        System.out.println("=================");
                        //dep sayısı
        for (int j = 0; j < company.length; j++) {


            for (int i = 0; i < company[j].length; i++) {

                System.out.println(company[j][i]);
            }
           // System.out.println(company[0]);
        }

    }
}
