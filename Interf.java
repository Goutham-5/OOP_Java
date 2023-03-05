  

            // Interface Inheritance


import java.io.*;
import java.util.*;
import java.lang.*;

interface Shape{
    
    void numberOfSides();          
    
    void Area(double ...s);        //Variable length argument

}

//Cannot reduce the visibility of the inherited method ( so method should be declared as public )

class Rectangle implements Shape{
    public void numberOfSides(){
        System.out.println("Rectangle has 4 sides ");  
    }

    public void Area(double ...s){
        System.out.println("The area of the Rectangle is: "+(s[0]*s[1]));
    }

}
class Triangle implements Shape{
    public void numberOfSides(){
        System.out.println("Triangle has 3 sides ");
    }

    public void Area(double ...s){
        System.out.println("The area of the Triangle is: "+(0.5*s[0]*s[1]));
    }

}
class Hexagon implements Shape{
    public void numberOfSides(){
        System.out.println("Hexagon has 6 sides ");
    }

    public void Area(double ...s){
        System.out.println("The area of the Hexagon is: "+  ((3*Math.sqrt(3))/2)*(s[0]*s[0]));
    }
}

class Interf {
    public static void main(String[] args) {
        System.out.println("Choose the shape \n1.Rectangle \n2.Triangle \n3.Hexagon");
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon hex = new Hexagon();
        
        System.out.println("Choose the Shape: ");
        int op = sc.nextInt();
        
        switch(op){
           case 1:
               System.out.println("Enter the length and breadth of the rectangle: ");
               double l = sc.nextDouble();
               double b = sc.nextDouble();
               r.numberOfSides();
               r.Area(l,b);
               break;
   
           case 2:
               System.out.println("Enter the base and height of the triangle: ");
               l = sc.nextDouble();
               b = sc.nextDouble();
               t.numberOfSides();
               t.Area(l,b);
               break;
           
           case 3:
               System.out.println("Enter the length of the hexagon: ");
               l = sc.nextDouble();
               hex.numberOfSides();
               hex.Area(l);
               break;

           default:
               System.out.println("Invalid Choice! ");
        }

    }
}
