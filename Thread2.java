
//Program to demonstrate the working of Threads in java by implementing the Runnable Interface
public class Thread2 implements Runnable{
    public void run(){
        System.out.println("The code is running inside a thread...run() method is called ");
    }
    public static void main(String[] args) {
        /* 
        If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method: 
        */
        //Creating objects for classes Thread2 and Thread.....
        Thread2 t2 = new Thread2();
        Thread t = new Thread(t2);
        t.start();      //start() Invokes the run() method
        System.out.println("The code is running outside the Thread.... ");
    }
}
