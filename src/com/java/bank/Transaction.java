package com.java.bank;

import java.util.Date;

public class Transaction {
    private int id;
    private Date date = new Date();
    private double montant;
    private Account fromAccount;
    private Account toAccount;

    public Transaction() {

    }

    public Transaction(double amount) {

    }

    public Transaction (double montant, Account accountFrom, Account accountTo) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }
}

// TP
// Account = 1 seul customer (simplification)
// Customer = id, nom, prenom
// Transaction = id, date, montant
// 1 Account = n transactions (faire la relation)
// 1 transaction = 1 account from + 1 account to (faire la relation)