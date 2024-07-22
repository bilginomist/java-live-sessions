package day_27_sixth_recap;

import java.util.Scanner;

public class J02_Login {

    public static void main(String[] args) {

        String realUserName="Mike";
        String realPassword="Abc1";

        Scanner scanner=new Scanner(System.in);

        int counter=0;
        for (int i=0; i < 3; i++) {
            System.out.println("Kullanıcı adınızı giriniz: ");
            String username=scanner.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            String password= scanner.nextLine();

            if (username.isBlank() && password.isBlank()){
                System.out.println("Kullanıcı adı ve şifre boş olamaz");
            } else if (username.isBlank()) {
                System.out.println("Kullanıcı adı boş olamaz");
            } else if (password.isBlank()) {
                System.out.println("Password boş olamaz");
            } else if (!password.equals(realPassword) || !username.equalsIgnoreCase(realUserName)) {
                System.out.println("Kullanıcı adı veya şifre geçerli değil tekrar deneyiniz");
            }else {
                System.out.println("Başarılı giriş");
                break;
            }

            counter++;
        }

        if (counter==3){
            System.out.println("Hesabınız kilitlendi");
        }





    }
}
