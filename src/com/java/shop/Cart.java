package com.java.shop;

import java.util.ArrayList;

public class Cart {
    ArrayList<MediaRow> list = new ArrayList<>();
    double totalPriceTTC;

    public Cart(){ //le pannier se construit toujours vide :pas de paramètre dans le constructeur

    }

    public void add(Media media, int nb){
        list.add(new MediaRow(media, nb));
    }

    public double getTotalPriceTTC() {
        totalPriceTTC = 0;
        for (MediaRow media:list) {
            totalPriceTTC += media.media.getNetPrice()*media.nbCopies;
        }
        return totalPriceTTC;
    }
}
