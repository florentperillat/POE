package com.java.shop;

public class MediaRow implements IMediaRow {

    Media media;
    int nbCopies = 1;

    public MediaRow(Media media, int nb){
        this.media = media;
        this.nbCopies = nb;
    }

    @Override
    public void add(){
        this.nbCopies++;
    }
    @Override
    public void add(int nb){
        this.nbCopies+=nb;
    }
    @Override
    public void remove(){
        this.nbCopies--;
    }
    @Override
    public void remove(int nb){ this.nbCopies-=nb; }
}
