package com.java.poo;

public class Program {

   public static void main(String[] args) {
       Point p1 = new Point();
       p1.x = 5;
       p1.y = -2;
       p1.display();
       p1.moveTo(3,2);
       p1.display();
       p1.moveRelative(3,-4);
       p1.display();
       Point p2 = new Point(4,3);
       p2.display();
       p2.moveRelative(p1);
   }

}