  

            // Abstract Class Inheritance
            

/* Write a Java program to create an abstract class named Shape that contains an empty method named numberOfSides().
 Provide three classes named Rectangle, Triangle, and Hexagon such that each one of the classes extends the class Shape. Each one of the classes contains only the method numberOfSides()that shows the number of sides in the given geometrical structures. 
*/

 import java.util.*;
 
 abstract class Shape{
     
     abstract void numberOfSides();          //abstract methods cannot have a body
     
     abstract void Area(double ...s);        //Variable length argument
 
 
     /* static void f1(){                   
         System.out.println("Hello ");       //Abstract Classes Can contain non-abstract methods as well
     } */
 }
 
 class Rectangle extends Shape{
     void numberOfSides(){
         System.out.println("Rectangle has 4 sides ");
     }
 
     void Area(double ...s){
         System.out.println("The area of the Rectangle is: "+(s[0]*s[1]));
     }
 
 }
 class Triangle extends Shape{
     void numberOfSides(){
         System.out.println("Triangle has 3 sides ");
     }
 
     void Area(double ...s){
         System.out.println("The area of the Triangle is: "+(0.5*s[0]*s[1]));
     }
 
 }
 class Hexagon extends Shape{
     void numberOfSides(){
         System.out.println("Hexagon has 6 sides ");
     }
 
     void Area(double ...s){
         System.out.println("The area of the Hexagon is: "+  ((3*Math.sqrt(3))/2)*(s[0]*s[0]));
     }
 }
 
 class Abst {
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
 