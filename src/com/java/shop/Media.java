package com.java.shop;

public class Media {
    private int id;
    private String title;
    private double price;
    private String genre;
    private String author;
    private int taux = 20;

    public Media(String title, String author, double price, String genre) {
        this.id = (int)(Math.random()*100);
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    public Media(){

    }
    public void display() {
        System.out.println("Article " + getId() + " : " + getTitle());
        System.out.println("Author : " + getAuthor());
        System.out.println("Price : " + getPrice());
        System.out.println("Net Price : " + getNetPrice());
    }

    public double getNetPrice(){
        return getPrice() *(100+ getTaux())/100;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getTaux() {
        return taux;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }
}
