
// Doubly Linked List creation and operations

import java.util.*;
/* 

class Doubly{
    
    class Node{
        int data;
        Node prev, next;
        Node(int data){
            this.data = data;
        }
    }
    
    Node head,tail = null;
    Node ptr, ptr1;

    void insert(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.prev = null;
            newNode.next = null;

        } 
        else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = null;
            tail = newNode;
        }
    }

    void display(){
        if (head == null) {
            System.out.println("Empty List ");
        } 
        else {
            ptr = head;
            while (ptr != null) {
                System.out.println(ptr.data+ " ");
                ptr = ptr.next;
            }

        }
    }

    //          ERROR
    void del_beg(){
        if (head == null) {
            System.out.println("Empty List");
        } 
        else {
            ptr = head;
            ptr1 = ptr.next;
            ptr.next = ptr1.next;
            ptr1.next.prev = null;
        }
    }


    void del_end(){
        //3 conditions used....and use head rather than using ptr
        if (head == null) {
            System.out.println("Empty List ");  //Empty List
        }
        else if (head.next == null) { //checks if the DLL contains a single element
            head = null;
        }
        else{
            ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.prev.next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Doubly doubly = new Doubly();
        int f = 0;
        while (f == 0) {
            System.out.println("\n1.Insertion at the end \n2.Display \n3.Deletion from the end \n4.Deletion from the begining  ");
            System.out.println(" ");
            System.out.print("Choose Operation: ");
            int op = sc.nextInt();
            System.out.println(" ");

            switch (op) {
                case 1:
                    System.out.print("Enter the number of nodes: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter the element: ");
                        int element = sc.nextInt();
                        doubly.insert(element);
                    }
                    break;
            
                case 2:
                    System.out.println("Displaying the nodes... ");
                    doubly.display();
                    break;

                case 3:
                    System.out.println("Deleting the last node... ");
                    doubly.del_end();
                    break;
                
                case 4:
                    System.out.println("Deleting the first node... ");
                    doubly.del_beg();
                    break;

                default:
                    System.out.println("Invalid Choice ");
                    break;
            }
        }
    }
} */


public class Doubly {
    class Node{
        int data;
        Node prev,next;
        Node(int data){
            this.data = data;
        }
    }
    Node head,tail = null;
    Node ptr,ptr1;
    void insert(int data){
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;    
            n.next = n.prev = null;
        }
        else {
            tail.next = n;
            n.prev = tail;
            n.next = null;
            tail = n;
        }
    }

    void display(){
        if(head  == null){
            System.out.println("Empty List");
        }
        else{
            ptr = head;
            while(ptr != null){
                System.out.println(ptr.data+ " ");
                ptr = ptr.next;
            }
        }
    }
    
}