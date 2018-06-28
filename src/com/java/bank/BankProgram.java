package com.java.bank;

public class BankProgram {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setId(1234567890);
        System.out.println(a1.getId());
        a1.deposit(100, a1);
        System.out.println(a1.getSolde());
        a1.withdraw(52);
        System.out.println(a1.getSolde());
        Account a2 = new Account(32145, 2, "toto", "tata");
        System.out.println(a1.getSolde());
        a1.deposit(2, a2);
        System.out.println(a1.getSolde());
        a1.block();
        System.out.println(a1.getSolde());
        a1.close();
    }
}
