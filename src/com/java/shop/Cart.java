package com.java.shop;

import java.util.HashSet;

public class Cart implements ICart {
    private HashSet<MediaRow> cartRowList = new HashSet<>();
    private double totalPriceTTC;

    public Cart(){ //le pannier se construit toujours vide :pas de paramètre dans le constructeur

    }

    @Override
    public void add(Media media, int nb) throws MediaException {
        if (cartRowList.contains(media)){
            for(MediaRow medrow:cartRowList){
                if (medrow.getMedia() == media) {
                    medrow.nbCopies+=nb;
                }
            }
        } else {
            cartRowList.add(new MediaRow(media, nb));
        }
        System.out.println(nb + " x " + media.getTitle() + " added to the cart");
    }

    @Override
    public void remove(Media media, int nb) throws MediaException {
        if (cartRowList.contains(media)){
            for(MediaRow medrow:cartRowList){
                if (medrow.nbCopies<=0){
                    throw new MediaException("No media to remove");
                }
                if (medrow.getMedia() == media) {
                    medrow.nbCopies-=nb;
                }
                if (medrow.nbCopies==0){
                    cartRowList.remove(media);
                }
            }
        }
        System.out.println(nb + " x " + media.getTitle() + " removed from the cart");
    }

    private MediaRow isMediaExists (IMedia media) {
        MediaRow res =null;
        for (MediaRow row:cartRowList) {
            if (media==row.getMedia()) {
                res = row;
                cartRowList.add(row);
            }
        }
        return res;
    }

    @Override
    public double getTotalPriceTTC() throws MediaException {
        this.totalPriceTTC = 0;
        for (MediaRow media:cartRowList) {
            totalPriceTTC += media.getMedia().getNetPrice()*media.nbCopies;
        }
        if (this.totalPriceTTC<0){
            throw new MediaException("Total price can't be negative");
        }
        return this.totalPriceTTC;
    }
    public void validate() throws MediaException{
        if (getTotalPriceTTC()<=0){
            throw new MediaException();
        }
        else {
            //TODO
        }
    }
}
