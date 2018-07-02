package com.java.shop;

public interface IDVD extends IMedia {
    void display();

    @Override
    double getNetPrice();

    String getZone();
}
