package com.java.shop;

public class MediaRow {

    Media media;
    int nbCopies = 1;

    public MediaRow(){

    }

    public MediaRow(Media media, int nb){
        this.media = media;
        this.nbCopies = nb;
    }

    public MediaRow(String title, String author, double price, String genre, int nbPage, String publicationYear, int nbCopies){
        this.media = new Book(title, author, price, genre, nbPage, publicationYear);
        this.nbCopies = nbCopies;
    }

    public MediaRow(String title, String author, double price, String genre,int nbTrack, int nbCopies){
        this.media = new CD(title, author, price, genre, nbTrack);
        this.nbCopies = nbCopies;
    }
    public MediaRow(String title, String author, double price, String genre,String zone, int nbCopies){
        this.media = new DVD(title, author, price, genre, zone);
        this.nbCopies = nbCopies;
    }
    public void add(){
        this.nbCopies++;
    }
    public void add(int nb){
        this.nbCopies+=nb;
    }
    public void remove(){
        this.nbCopies--;
    }
    public void remove(int nb){ this.nbCopies-=nb; }
}
