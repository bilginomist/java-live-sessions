package day_08_selection_statements_nested_if;

public class J03_LoginToBilginomist {


    public static void main(String[] args) {

        String url="https://bilginomist.com/login";


        String username="admin";

        String password="1234";


        if (url=="https://bilginomist.com/login"){

            if (username=="admin" && password=="1234"){

                System.out.println("Sisteme giriş başarılı");
            }else {
                System.out.println("username yada password hatalı");
            }


        }else {

            System.out.println("Yanlış adrestesiniz");
        }




    }
}
