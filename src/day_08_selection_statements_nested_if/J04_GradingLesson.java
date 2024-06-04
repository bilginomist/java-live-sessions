package day_08_selection_statements_nested_if;

public class J04_GradingLesson {

    public static void main(String[] args) {

        //öğretmen not (score) girer

        int score= 70;

        /*

        15
        15
        __________
         30
         */

        //kontrol et girilen not 0 ile 100 arasonda mı

      //  if (0<=score<=100)  //HATALI JAVADA

        if (score>=0 && score<=100) {

            //girilen not doğruysa yapılacaklar

            //1 not 90(dahil) ile 100(dahil) arasında ise print AA

            if (score>=90 ){
                System.out.println("AA");
            }

            //2 not 80 (dahil) ile 89 (dahil) ise print AB

           else   if (score>=80){
                System.out.println("AB");
            }

            //3 not 70 (dahil) ile 79 (dahil) ise print BB
          else   if (score>=70){
                System.out.println("BB");
            }


            // 4 not 70 az ise print CC
           else   if (score <70){
                System.out.println("CC");
            }


        }else {
            //eğer not 0 ile 100 arasında değilse

            //not hatalı yazmak lazım

            System.out.println("not hatalı");
        }





    }
}
