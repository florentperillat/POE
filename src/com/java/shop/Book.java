package com.java.shop;


public class Book extends Media implements IBook {

    private int nbPage;
    private String publicationYear;
    private int taux = 5;

    public Book(String title, String author, double price, String genre, int nbPage, String publicationYear){
        super(title, author, price, genre);
        this.nbPage = nbPage;
        this.publicationYear = publicationYear;
    }

    @Override
    public double getNetPrice(){
        return getPrice()*(100+getTaux())/100;
    }

    @Override
    public int getTaux() {
        return taux;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(getNbPage() + " pages");
        System.out.println("Published in " + getPublicationYear());
    }

    @Override
    public int getNbPage() {
        return nbPage;
    }

    @Override
    public String getPublicationYear() {
        return publicationYear;
    }
}
