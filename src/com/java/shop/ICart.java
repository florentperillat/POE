package com.java.shop;

public interface ICart {
    void add(Media media, int nb) throws MediaException;

    void remove(Media media, int nb) throws MediaException;

    double getTotalPriceTTC() throws MediaException;
}
