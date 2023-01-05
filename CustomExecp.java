

//  Java Exception Handling
import java.util.*;

class AgeException extends Exception{
	AgeException(String str){
		
	}
	
}

public class CustomExecp{
	public static void main(String[] args) {
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
		    System.out.println("Access Denied ! "+ e+ e.getMessage());		
		}

		finally{
		    System.out.println("Program Terminated");
		}
    	}
}


