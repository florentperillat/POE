package com.java.shop;
import java.util.ArrayList;

public abstract class Media implements IMedia {
    private int id;
    private String title;
    private double price;
    private String genre;
    private ArrayList<Author> authorList = new ArrayList<>();
    private int taux = 20;

    public Media(String title, String author, double price, String genre) {
        this.id = (int) (Math.random() * 100);
        this.title = title;
        this.authorList.add(new Author(author));
        this.price = price;
        this.genre = genre;
    }

    public Media() {

    }

    @Override
    public void display() {
        System.out.println("Article " + getId() + " : " + getTitle());
        System.out.println("Author : " + authorList);
        System.out.println("Price : " + getPrice());
        System.out.println("Net Price : " + getNetPrice());
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getTaux() {
        return taux;
    }

    @Override
    public String getGenre() {
        return genre;
    }

}
