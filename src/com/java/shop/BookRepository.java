package com.java.shop;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookRepository {

    private List<Book> bookList = new ArrayList<>();
    private String uri ="";


    public void load(String uri) throws IOException {
        this.uri = uri;
        BufferedReader reader = new BufferedReader(new FileReader(this.uri));
        reader.readLine();
        String line = reader.readLine();
        while(line != null) {
            StringTokenizer st = new StringTokenizer(line,",");
            st.nextToken();
            String title = st.nextToken();
            Double price = Double.parseDouble(st.nextToken());
            Integer nbPage = Integer.parseInt(st.nextToken());
            String author = st.nextToken();
            bookList.add(new Book(title,author, price, "unknown", nbPage, "2018"));
            line = reader.readLine();
        }
        reader.close();
    }

    public void getAll() {
        for(Book b:bookList) {
            b.display();
        }
    }

    public Book getById(int id) {
        for(Book b:bookList) {
            if(b.getId()==id){
                return b;
            }
        }
        return null;
    }

    public List<Book> searchByTitle(String title) {
        return bookList
                .stream()
                .filter(book -> book
                        .getTitle()
                        .toUpperCase()
                        .contains(title
                                .toUpperCase()))
                .collect(Collectors
                        .toList());
    }

    public List<Book> searchByPrice(double price) {
        return bookList
                .stream()
                .filter(book -> book
                        .getPrice()<=price)
                .collect(Collectors
                        .toList());
    }

    public void addBook (Book book) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("excel.csv"));
        writer.newLine();
        writer.write(book.getId()+",");
        writer.write(book.getTitle()+",");
        writer.write((book.getNetPrice())+",");
        writer.write((book.getNbPage())+",");
        writer.write("Publisher");
        writer.close();
    }

    public void removeBook (Book book) {

    }

}
