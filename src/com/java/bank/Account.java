package com.java.bank;

import java.util.Date;
import java.util.*;

public class Account {

    // Passer les attributs en private
    // Créer les getters setters
    // Créer un constructeur sans paramètre (constructeur par défaut)
    // Créer un constructeur avec les paramètres obligatoires
    // Créer toString

    private int id;
    private double solde = 0;
    boolean isActive = true;
    boolean isBlocked = false;
    private Date creationDate = new Date();
    private ArrayList<Transaction> transactionList = new ArrayList<>();
    private Customer customer = new Customer();

    Account(){

    }

    Account(int id, double solde, String name, String firstname) {
        this.setId(id);
        this.customer.setName(name);
        this.customer.setFirstName(firstname);
        this.solde=solde;
    }

    Account(Customer c) {
        this.customer.setName(c.getName());
        this.customer.setFirstName(c.getFirstName());
    }

    void deposit(double amount, Account acc) {
        if(isActive && !isBlocked) {
            solde = getSolde() + amount;
            getTransactionList().add(new Transaction(amount));
        }
    }

    double withdraw(double amount) {
        if(isActive  && !isBlocked) {
            if (amount <= getSolde()) {
                solde = getSolde() - amount;
                return amount;
            } else {
                return 0;
            }
        }
        else {
            return 0;
        }
    }

    void close() {
        isActive = false;
    }

    void block() {
        isBlocked = true;
    }

    void unblock() {
        isBlocked = false;
    }

    public int getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String toString() {
        String res = new String();
        res += "ID : " + getId();
        res += "\nSolde : " + getSolde();
        res += "\nCreation Date : " + getCreationDate();
        res += "\nisActive : " + isActive;
        res += "\nisBlocked : " + isBlocked;
        return res;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
}