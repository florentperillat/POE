package com.java.shop;

public class Author {
    private String firstName;
    private String name;
    private String publisher;

    public Author (String name){
        this.setName(name);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
