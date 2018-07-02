package com.java.shop;

public class Author implements IAuthor {
    private String firstName;
    private String name;
    private String publisher;

    public Author (String name){
        this.setName(name);
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
