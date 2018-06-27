package com.java.poo;

public class Point {

    // attributs
    double x;
    double y;

    // méthodes, actions

    Point () {
        this.x = 0;
        this.y = 0;
    }

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    void moveTo(double x, double y){ //absolute
        this.x = x; //ambiguité donc on rajoute un "this."
        this.y = y; //pour différencier l'attribut de l'objet et le paramètre de la méthode
    }

    void display(){ //String toString() existe et c'est une méthode de l'objet
        System.out.println("(" + x + ","+ y + ")");
    }

    void moveRelative(double x, double y) { //relative
        this.x += x;
        this.y += y;
    }

    void moveRelative(Point p){
        this.x += p.x;
        this.y += p.y;

    }
}


