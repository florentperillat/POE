package com.java.geometry;

public class Point {

    // attributs
    private double x;
    private double y;

    // méthodes, actions

    Point () {
        this.setX(0);
        this.setY(0);
    }

    Point(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    void moveTo(double x, double y){ //absolute
        this.setX(x); //ambiguité donc on rajoute un "this."
        this.setY(y); //pour différencier l'attribut de l'objet et le paramètre de la méthode
    }

    void display(){ //String toString() existe et c'est une méthode de l'objet
        System.out.println("(" + getX() + ","+ getY() + ")");
    }

    void moveRelative(double x, double y) { //relative
        this.setX(this.getX() + x);
        this.setY(this.getY() + y);
    }

    void moveRelative(Point p){
        this.setX(this.getX() + p.getX());
        this.setY(this.getY() + p.getY());

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}


