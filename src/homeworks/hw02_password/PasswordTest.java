package homeworks.hw02_password;

public class PasswordTest {

    public static void main(String[] args) {

        Password password=new Password();

        System.out.println(password);

        password.setUsername("adam");
        System.out.println(password);

        System.out.println("password.getUsername(\"ad\") = " + password.getUsername("ada"));


        password.setPassword("adam","adam123");

        System.out.println(password);

        System.out.println(password.getPassword("adam"));
    }
}
