package com.java.shop;

public class DVD extends Media implements IDVD {

    private String zone;

    public DVD(String title, String author, double price, String genre,String zone){
        super(title, author, price, genre);
        this.zone = zone;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Zone : " + getZone());
    }
    @Override
    public double getNetPrice(){
        return (double)(((int)(this.getPrice()*0.8)*100)/100);
    }

    @Override
    public String getZone() {
        return zone;
    }
}
