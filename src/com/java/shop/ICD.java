package com.java.shop;

public interface ICD extends IMedia {
    void display();

    @Override
    double getNetPrice();

    int getNbTrack();
}
