package com.java.shop;
import java.util.ArrayList;

public abstract class Media {
    private int id;
    private String title;
    private double price;
    private String genre;
    private ArrayList<Author> authorList = new ArrayList<>();
    private int taux = 20;

    public Media(String title, String author, double price, String genre) {
        this.id = (int)(Math.random()*100);
        this.title = title;
        this.authorList.add(new Author(author));
        this.price = price;
        this.genre = genre;
    }

    public Media(){

    }
    public void display() {
        System.out.println("Article " + getId() + " : " + getTitle());
        System.out.println("Author : " + getAuthorList().get(0).getName());
        System.out.println("Price : " + getPrice());
        System.out.println("Net Price : " + getNetPrice());
    }

    public abstract double getNetPrice();

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

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }
}
