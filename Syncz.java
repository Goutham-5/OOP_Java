
//  Java program to demonstrate Thread Synchronisation 
public class Syncz implements Runnable {
    int token = 1;
    public void run ()
    {
        synchronized (this)
        {
            Thread t = Thread.currentThread ();
            String name = t.getName ();
            System.out.println (token + ".....alloted to " + name);
            token++;
        }
    }
}
class SynchroBlock
{
    public static void main (String[]args)
    {
        Syncz s1 = new Syncz ();

        Thread t1 = new Thread (s1);
        Thread t2 = new Thread (s1);
        Thread t3 = new Thread (s1);

        t1.setName ("t1");
        t2.setName ("t2");
        t3.setName ("t3");

        t1.start ();
        t2.start ();
        t3.start ();
    }
}
