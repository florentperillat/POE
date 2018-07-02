package com.java.shop;

public class CD extends Media {

    private int nbTrack;

    public CD(String title, String author, double price, String genre,int nbTrack){
        super(title, author, price, genre);
        this.nbTrack = nbTrack;
    }

    public void display(){
        super.display();
        System.out.println(getNbTrack() + " tracks");
    }

    @Override
    public double getNetPrice() {
            return (double)((int)(getPrice() *(100+ getTaux()))/100);
    }


    public int getNbTrack() {
        return nbTrack;
    }
}
