/* 
import java.util.*;
class RandomNumbers extends Thread{
    public void run(){
        for (int i = 1; i < 2; i++){
            Random rd = new Random();
            int Random_int = rd.nextInt(100);
            System.out.println("Random Integer is:"+ Random_int);
            if ((Random_int % 2) == 0){
                Even t2 = new Even(Random_int);
                t2.start();
            }
            else{
                Odd t3 = new Odd(Random_int);
                t3.start();
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
                System.out.println("ERROR OCCURED");
            }
        }
    }
    class Even extends Thread{
        int n;
        Even(int number){
            n = number;
        }
        public void run(){
            for (int i = 1 ; i <= n;i++){
                if (i % 2 == 0)
                    System.out.println(i);
            }
        }
    }
    class Odd extends Thread{
        int n;
        Odd(int number){
            n = number;
        }
        public void run(){
            for (int i = 1 ; i <= n; i++){
                if (i % 2 == 1)
                    System.out.println(i);
            }
        }
    }
}
public class MultiThread{
    public static void main(String args[]){
        RandomNumbers s = new RandomNumbers();
        s.start();
    }
}

 */

import java.util.*;
class Rnum extends Thread{
    public void run(){
        Random rd = new Random();
        int num = rd.nextInt(10);
        System.out.println("Random Integer is:"+ num);
        if (num%2 == 0) {
            Even e = new Even(num);
            e.start();
        } 
        else {
            Odd o = new Odd(num);
            o.start();
        }
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
}
class Even extends Thread{
    int n;
    Even(int n){
        this.n = n;
    }
    public void run(){
        System.out.print(n*n);
    }
}
class Odd extends Thread{
    int n;
    Odd(int n){
        this.n = n;
    }
    public void run(){
        System.out.print(n*n*n);
    }
}
public class MultiThread {
    public static void main(String[] args) {
        Rnum r = new Rnum();
        r.start();
    }  
}