package com.java.bank;

public class BankProgram {
    static void main(String[] args) {
        Account a1 = new Account();
        a1.accountNumber="1234567890";
        a1.ownerName="toto";
        a1.iban="1234567890";
        a1.content=0;
        a1.display();
        a1.add(100);
        a1.display();
        a1.retrait(50);
        a1.display();
        Account a2 = new Account("32145", "tata", "982973", 2);
        a2.display();
        a2.transfert(a1, 2);
        a2.display();
        a1.display();
    }
}
