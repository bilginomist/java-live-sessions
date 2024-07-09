package day_25_string_part_4;

public class J01_Contains {


    public static void main(String[] args) {

        String mySentence="Ali at1a bak";

        String aranan="ata";
                //boolean
        if (mySentence.contains(aranan)) {
            System.out.println("Bulundu");
        }
        else {
            System.out.println("Bulunamadı");
        }


      int konum=  mySentence.indexOf(aranan);

        if (konum>=0){
            System.out.println("Bulundu");
        }else {
            System.out.println("Bulunamadı");
        }





    }
}
