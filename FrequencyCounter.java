
import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: "); 
        String str = sc.nextLine();
        System.out.print("Enter the character: "); 
        char ch = sc.next().charAt(0);
        int count  = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count = count+1;
            }
        }
        System.out.println("The entered character has occured "+count+" times");
    }
    
}