package Lessons;

public class BankAccount {
    int id;
    String name;
    double balance;

    public static void main(String[] args){

        BankAccount Oleg = new BankAccount();
        BankAccount Stas = new BankAccount();
        BankAccount Vika = new BankAccount();

        Oleg.id=1;
        Stas.id=2;
        Vika.id=3;

        Oleg.name="Oleg";
        Stas.name="Stas";
        Vika.name="Vika";

        Oleg.balance=1.1;
        Stas.balance=2.2;
        Vika.balance=3.3;

    }
}
