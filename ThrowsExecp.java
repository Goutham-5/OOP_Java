

//  Java Exception Handling
import java.util.*;

class AgeException extends Exception{
	AgeException(String str){
		//Constructor is Passed
	}
	
	// In Case of Custom Exception create a class with the <custom error name> that extends from the class(Exception)
}

public class ThrowsExecp{
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age<18) {
                throw new AgeException("Unauthorised Access !");
            } 
            else {
                System.out.println("Access Granted");
            }
        } 
        
        catch(AgeException e) {
            System.out.println("Access Denied ! "+ e+ e.getMessage());		// getMessage: Returns the detail message string of this throwable.
        }

        finally{
			System.out.println("");
            System.out.println("Program Terminated");
        }
    }
}


// Java program to demonstrate working of throws
// class ThrowsExecp
// {
// 	static void fun() throws IllegalAccessException
// 	{
// 		System.out.println("Inside fun(). ");
// 		throw new IllegalAccessException("demo");
// 	}
// 	public static void main(String args[])
// 	{
// 		try
// 		{
// 			fun();
// 		}
// 		catch(IllegalAccessException e)
// 		{
// 			System.out.println("caught in main.");
// 		}
// 	}
// }
