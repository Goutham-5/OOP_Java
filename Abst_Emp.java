

 /* Write a Java program which creates a class named 'Employee' having the following members: Name, Age, Phone number, Address, Salary. It also has a method named 
 'print-Salary( )' which prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherits the 'Employee' class. The 'Officer' and 'Manager' classes have data 
 members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an officer and a manager by making an object of both 
 of these classes and print the same.
 */

//import java.io.*;
/* import java.util.*;

class Employee{
    String name;
    int age;
    long phn;
    String address;
    long salary;

    void printSalary(){
        System.out.println("The Salary is: "+ salary);
    }
}

class Officer extends Employee{
    String specialization;
}

class Manager extends Employee{
    String department;
}


public class Abst_Emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Officer details... ");
        System.out.print("Enter the number of Officers: ");
        int off_no = sc.nextInt();
        Officer o[] = new Officer[off_no];
        System.out.println(" ");
        
        for(int i=0; i<off_no; i++) {

            //Creating Officer object
            Officer off = new Officer();

            System.out.println("Enter Officer name: ");
            off.name = sc.nextLine();
            off.name = sc.nextLine();
            System.out.println("Enter Officer age: ");
            off.age = sc.nextInt();
            System.out.println("Enter Officer Phone number: ");
            off.phn = sc.nextLong();
            System.out.println("Enter Officer address: ");
            off.address = sc.nextLine();
            off.address = sc.nextLine();
            System.out.println("Enter Officer Salary: ");
            off.salary = sc.nextLong();
            o[i] = off;
        }
        
        System.out.println("Enter Manager details... ");
        System.out.print("Enter the number of Managers: ");
        int man_no = sc.nextInt();
        Manager m[] = new Manager[man_no];
        System.out.println(" ");
        for(int i = 0; i < man_no; i++) {

            //Creating Manager object
            Manager man = new Manager();

            System.out.println("Enter Manager name: ");
            man.name = sc.nextLine();
            man.name = sc.nextLine();
            System.out.println("Enter Manager age: ");
            man.age = sc.nextInt();
            System.out.println("Enter Manager Phone number: ");
            man.phn = sc.nextLong();
            System.out.println("Enter Manager address: ");
            man.address = sc.nextLine();
            man.address = sc.nextLine();
            System.out.println("Enter Manager Salary: ");
            man.salary = sc.nextLong();
            m[i] = man;
        }

        //Display the details
        System.out.println(" ");
        for(int i=0; i<off_no; i++){
            System.out.println("Displaying Officer details... ");
            System.out.println(" ");
            System.out.println("Officer name: "+o[i].name);
            System.out.println("Officer age: "+o[i].age);
            System.out.println("Officer Phone number: "+o[i].phn);
            System.out.println("Officer address: "+o[i].address);
            o[i].printSalary();
        }

        System.out.println(" ");
        for(int i = 0; i < man_no; i++){
            System.out.println("Displaying Manager details... ");
            System.out.println(" ");
            System.out.println("Manager name: "+m[i].name);
            System.out.println("Manager age: "+m[i].age);
            System.out.println("Manager Phone number: "+m[i].phn);
            System.out.println("Manager address: "+m[i].address);
            System.out.println("Manager Salary: "+m[i].salary);
            m[i].printSalary();
        }
    }
}
 */

 import java.util.Scanner; 
 class Employee{
     String name;
     int age;
     long phno;
     String add;
     int sal;
 
     Employee(){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter name:");
         name=sc.nextLine();
         System.out.print("Enter age:");
         age=Integer.parseInt(sc.nextLine());
         System.out.print("Enter phno:");
         phno=Long.parseLong(sc.nextLine());
         System.out.print("Enter address:");
         add=sc.nextLine();
         System.out.print("Enter salary:");
         sal=Integer.parseInt(sc.nextLine());
     }
     void printSal(){
         System.out.println("the salary:"+sal);
     }
     void printDetails(){
         System.out.println("the name:"+name);
         System.out.println("the age:"+age);
         System.out.println("the phno:"+phno);
         System.out.println("the address:"+add);
         }
 }
 class Officer extends Employee{
     String spec;
     String dep;
     Officer(){
         super();
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter specialization:");
         spec=sc.nextLine();
         System.out.print("Enter department:");
         dep=sc.nextLine();
     }
     void printOff(){
         System.out.println("the spec:"+spec);
         System.out.println("the dep:"+dep);   
     }
 }
 class Abst_Emp{
     public static void main(String[] args) {
         int n,i;
         Scanner sc=new Scanner(System.in);
         System.out.println("No of entries:");
         n=sc.nextInt();
         Officer temp;
         
         Officer[] obj=new Officer[n];
         System.out.print("Enter details:");
         for(i=0  ;i<n;i++){
             temp=new Officer();
             obj[i]=temp;
             obj[i].printDetails();
             obj[i].printSal();
             obj[i].printOff();
         }
     }
 }