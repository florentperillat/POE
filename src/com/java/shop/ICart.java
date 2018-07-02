package com.java.shop;

public interface ICart {
    void add(Media media, int nb);

    void remove(Media media, int nb);

    double getTotalPriceTTC();
}
