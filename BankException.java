
import java.io.*;
import java.util.*;

class AmountException extends Exception{
    AmountException(){

    }
}

public class BankException {
    public static void main(String[] args) throws Exception{
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the amount to be withdrawn: "); 
       int amount  = sc.nextInt();
       try{
            if (amount > 50000) {
                throw new AmountException();
            } 
            else {
                System.out.println("Amount can be withdrawn successfully");
            }
       }
       catch(AmountException ae){
            String str  = " Needs Check Leaf for bulk withdrawal";
            System.out.println("Entered Amount cannot be withdrawn via ATM "+ ae + str);
       }
       finally{
        System.out.println("Program Terminated...");
       }
    }
    
}
