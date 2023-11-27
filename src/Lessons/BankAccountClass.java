package Lessons;

public class BankAccountClass {
    int id;
    String name;
    double balance;

    void popolnenie(double summapopolnenia) {
        System.out.println("Balans" + balance);
        System.out.println("Popolnit" + summapopolnenia);
        balance += summapopolnenia;
        System.out.println("Balans" + balance);

    }

    void snatie(double summaposnatia) {
        System.out.println("Balans" + balance);
        System.out.println("Popolnit" + summaposnatia);
        balance -= summaposnatia;
        System.out.println("Balans" + balance);
    }
}
class BankAccountTest{
        public static void main(String[] args){
            BankAccountClass MyBankaccount = new BankAccountClass();
            MyBankaccount.balance=100.00;

            MyBankaccount.popolnenie(11.1);
        }

}

