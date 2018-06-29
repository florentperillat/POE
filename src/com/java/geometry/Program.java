package com.java.geometry;

public class Program {

   public static void main(String[] args) {
       Point p1 = new Point();
       p1.setX(5);
       p1.setY(-2);
       p1.display();
       p1.moveTo(3,2);
       p1.display();
       p1.moveRelative(3,-4);
       p1.display();
       Point p2 = new Point(4,3);
       p2.display();
       p2.moveRelative(p1);
       TriangleRectangle t1 = new TriangleRectangle(3,4);
        t1.display();
   }

}
