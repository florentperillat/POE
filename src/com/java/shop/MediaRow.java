package com.java.shop;

public class MediaRow implements IMediaRow {

    private Media media;
    int nbCopies = 1;

    public MediaRow(Media media, int nb) throws MediaException{
        this.media = media;
        if (nbCopies<1) {
            throw new MediaException("Quantity must be 1 or more");
        }
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

    public Media getMedia() {
        return media;
    }
}
