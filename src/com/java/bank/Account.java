package com.java.bank;

public class Account {
    String accountNumber;
    String ownerName;
    String iban;
    double content;

    Account() {
        accountNumber = "";
        ownerName = "";
        iban = "";
        content = 0;
    }

    Account(String accountNumber, String ownerName, String iban, double content) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.iban = iban;
        this.content = content;
    }

    void display(){
        System.out.println(ownerName + " : " + accountNumber);
        System.out.println(iban);
        System.out.println(content + "€");
    }

    void add(double montant) {
        this.content+=montant;
    }

    void retrait(double montant){
        this.content-=montant;
    }

    void transfert(Account a, double montant) {
        this.content-=montant;
        a.content+=montant;
    }
}
