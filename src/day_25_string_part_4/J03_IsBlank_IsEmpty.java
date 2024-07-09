package day_25_string_part_4;

public class J03_IsBlank_IsEmpty {


    public static void main(String[] args) {


        String result="";

        //bir password boşluk kabul etmez pasword=

        System.out.println("result.length() = " + result.length());
        //isBlank string boş olduğuna bakıyor ama değer olarak
        System.out.println("result.isBlank() = " + result.isBlank());
        //isEmpty string boş olduğuna bakıyor ama uzunluk olarak
        System.out.println("result.isEmpty() = " + result.isEmpty());



        String password="         "; //geçerli değil

//eğer boş ise geçerli değil
        if (password.isBlank()){
            System.out.println("Geçersiz");
        }else {
            System.out.println("Geçerli");
        }
    }
}
