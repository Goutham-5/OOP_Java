

//Program to demonstrate the working of Threads in java by extending the Thread class

//The purpose of start() is to create a separate call stack for the thread. A separate call stack is created by it, and then run() is called by JVM.

public class Thread1 extends Thread{

    // attempting to assign weaker access privileges; was public
    public void run(){
        System.out.println("The code is running inside a thread...run() method is called ");
    }

    public static void main(String[] args) {

        Thread1 t1 = new Thread1();

        t1.start(); // start() invokes the run() method 
        
        System.out.println("This code is outside of the thread");
    }


}


