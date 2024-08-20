package day_42_oop_part_4_inheritance_3.super_keyword.variable;

public class Test {

    public static void main(String[] args) {

        PrivateClient privateClient=new PrivateClient();

        System.out.println(privateClient.creditRate);

        System.out.println(privateClient.getNonPrivateClientRate());

        System.out.println(privateClient);

    }
}
