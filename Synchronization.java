
//Java Program to demonstrate Thread Synchronization 

public class Synchronization implements Runnable{

    // System.out.print("Enter the number of available tickets: ");
    // int tickets = sc.nextInt();

    int tickets = 5;
    static int i = 2, j = 4, k = 5;

    synchronized void bookticket(int wanted_tickets, String name){
        if (wanted_tickets <= tickets) {
            System.out.println(wanted_tickets + " booked to "+ name );
        } 
        else {
            System.out.println("No tickets to book....try selecting less number of tickets ");
        }
    }

    public void run(){
        String name  = Thread.currentThread().getName();

        if (name.equals("t1")) {
            bookticket(i, name);
        } 
        else if(name.equals("t2"))
        {
            bookticket(j, name);
        }
        else{
            bookticket(k, name);
        }
    }

    public static void main(String[] args) {
        //Scanner sc  = new Scanner(System.in);
        
        Synchronization s = new Synchronization();

        // System.out.print("Enter the number of available tickets: ");
        // int tickets = sc.nextInt();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        //Actual nmaes of the threads
        /* System.out.println( t1.getName() );
        System.out.println( t2.getName() );
        System.out.println( t3.getName() );
 */
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();
    }
}

/*
With Synchronization....
2 booked to t1
5 booked to t3
4 booked to t2

Without Synchronization....
4 booked to t2
5 booked to t3
2 booked to t1

*/