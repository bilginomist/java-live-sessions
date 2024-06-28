package day_20_fifth_recap.pac02;

public class BankAccountClient {


    public static void main(String[] args) {

        BankAccount bankAccount1=new BankAccount();

        bankAccount1.accountHolder="Adam";
        bankAccount1.accountNumber=123456789;

        //System.out.println(bankAccount1);

        bankAccount1.showBalance();

        bankAccount1.deposit(100); //100

        System.out.println("=================");
        bankAccount1.showBalance();

        bankAccount1.deposit(100); //200

        System.out.println(bankAccount1);


        bankAccount1.withdraw(100); //100



        bankAccount1.withdraw(100); //0

        bankAccount1.deposit(100);

        bankAccount1.charge("Su",10);
        bankAccount1.showBalance();



    }
}
