package com.java.shop;

import java.util.ArrayList;

public class Cart {
    ArrayList<MediaCopies> list = new ArrayList<>();
    double totalPriceTTC;

    public Cart(){

    }

    public void add(Media media, int nb){
        list.add(new MediaCopies(media, nb));
    }

    public double getTotalPriceTTC() {
        totalPriceTTC = 0;
        for (MediaCopies media:list) {
            totalPriceTTC += media.media.getNetPrice()*media.nbCopies;
        }
        return totalPriceTTC;
    }
}
