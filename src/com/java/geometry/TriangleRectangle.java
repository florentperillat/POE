package com.java.geometry;

public class TriangleRectangle extends Rectangle {



    // Herite de Rectangle
    public TriangleRectangle(double height, double width){
        super(height, width);
    }
    public TriangleRectangle(){
        super();
    }

    // getSurface
    public double getSurface(){
        return (super.getSurface()/2);
    }

    // Hypothenuse

    public double hypothenuse(){
        return Math.sqrt(Math.pow(this.getHeight(),2)+Math.pow(this.getWidth(),2));
    }

    // Perimetre

    public double getPerimeter(){
        return (this.getHeight()+this.getWidth()+hypothenuse());
    }

    public void display(){
        System.out.println("Longueur : " + this.getHeight());
        System.out.println("Largeur : " + this.getWidth());
        System.out.println("Surface : " + this.getSurface());
        System.out.println("Hypothenuse : " + this.hypothenuse());
        System.out.println("Perimetre : " + this.getPerimeter());
    }
}
