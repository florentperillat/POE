package com.java.shop;

import java.awt.*;
import java.io.IOException;

public class ProgramShop {

    public static void main (String[] args) {
        Media b1 = new Book("BookTitle", "Toto", 15, "Policier", 200, "2015");
        Media d1 = new DVD("DVDTitle", "tata", 20, "Science-fiction", "Zone");
        Media c1 = new CD("CDTitle", "titi", 10, "Rap", 18);
        b1.display();
        c1.display();
        d1.display();
        Media c2 = new CD("CDTitle 2", "tutu", 9, "Chants grégoriens", 30);
        c2.display();

        Cart cart = new Cart();
        try {
            cart.add(b1, 1);
            cart.add(d1, 2);
            cart.add(c1, 3);
            //System.out.println("Total price TTC cart = " + cart.getTotalPriceTTC());
            cart.remove(d1, 2);
            System.out.println("Total price TTC cart = " + cart.getTotalPriceTTC());
        } catch (MediaException e) {
            System.out.println("Exception catch");
        }

        BookRepository br = new BookRepository();
        try {
            br.load("excel.csv");
            br.getAll();
            br.getById(29).display();
            System.out.println(br.searchByTitle("long"));
            System.out.println(br.searchByPrice(10));
            br.addBook(new Book("Zzz", "Moi", 10, "dodo", 20, "2018"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}