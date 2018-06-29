package com.java.shop;

public class programShop {

    public static void main (String[] args) {
        Media b1 = new Book("BookTitle", "Toto", 15, "Policier", 200, "2015");
        Media d1 = new DVD("DVDTitle", "tata", 20, "Science-fiction", "Zone");
        Media c1 = new CD("CDTitle", "titi", 10, "Rap", 18);
        b1.display();
        c1.display();
        d1.display();
        Media c2 = new CD("CDTitle 2", "tutu", 9, "Chants grégoriens", 30);
        c2.display();
    }
}
