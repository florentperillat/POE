package com.java.shop;

public class CartRow {

    private Media media;
    private int row = 1;

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public void add() {
        row++;
    }

    public void remove() {
        if(row>1) {
            row--;
        } else {
            System.out.println("Impossible de décrémenter davantage.");
        }
    }
}
