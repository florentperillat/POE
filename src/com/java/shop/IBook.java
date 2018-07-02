package com.java.shop;

public interface IBook extends IMedia {
    double getNetPrice();

    @Override
    int getTaux();

    void display();

    int getNbPage();

    String getPublicationYear();
}
