package day_20_fifth_recap.pac02;

public class BankAccount {

    public double balance;

    public String accountHolder;

    public long accountNumber;


    //hesaba para yatırma
    public void deposit(double amount) {
        balance = balance + amount;

        System.out.println(accountNumber +" nolu hesabınıza " + amount +" yatırdınız");
    }

    //hesaptan para çekme
    public void withdraw(double amount) {

        if (amount>balance){
            System.out.println("Yetersiz bakiye hesabınızda " + balance +" var");
        }else {
            balance=balance-amount;

            System.out.println("Paranızı alın");
        }



    }

    //hesap bilgileri
    public void showBalance() {

        System.out.println("Account Holder: " +accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

    }

    //hesaptan alışveriş
    public void charge(String item, double price) {

        if (price>balance){
            System.out.println("Yetersiz bakiye");
        }else {
            balance=balance-price;

            System.out.println(item + " ürününüzü alabilirsiniz");

        }



    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
