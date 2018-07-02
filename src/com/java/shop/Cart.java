package com.java.shop;

import java.util.HashSet;

public class Cart {
    HashSet<MediaRow> hashset = new HashSet<>();
    double totalPriceTTC;

    public Cart(){ //le pannier se construit toujours vide :pas de paramètre dans le constructeur

    }

    public void add(Media media, int nb){
        if (hashset.contains(media)){
            for(MediaRow medrow:hashset){
                if (medrow.media == media) {
                    medrow.nbCopies+=nb;
                }
            }
        } else {
            hashset.add(new MediaRow(media, nb));
        }
        System.out.println(nb + " x " + media.getTitle() + " added to the cart");
    }

    public void remove(Media media, int nb){
        if (hashset.contains(media)){
            for(MediaRow medrow:hashset){
                if (medrow.media == media) {
                    medrow.nbCopies-=nb;
                }
                if (medrow.nbCopies==0){
                    hashset.remove(media);
                }
            }
        }
        System.out.println(nb + " x " + media.getTitle() + " removed from the cart");
    }

    public double getTotalPriceTTC() {
        this.totalPriceTTC = 0;
        for (MediaRow media:hashset) {
            totalPriceTTC += media.media.getNetPrice()*media.nbCopies;
        }
        return this.totalPriceTTC;
    }
}
