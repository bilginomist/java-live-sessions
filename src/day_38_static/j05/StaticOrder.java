package day_38_static.j05;

public class StaticOrder {


    //username ve password girme işlemi
    static {
        System.out.println("USERNAME PASSWORD GİR");
    }

    static {

        System.out.println("GELEN KOD GİRİLİR");
    }

    static {
        System.out.println("SİSTEME GİRİŞ BAŞARILI");
    }


    //statik methodlar yukarıdan aşağıya HER ŞEYDEN ÖNCE çalışır




    public static void main(String[] args) {

      StaticOrder login1=  new StaticOrder();
      StaticOrder login2=  new StaticOrder();


    }
}
