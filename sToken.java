  
import java.util.*;
public class sToken {
    public static void main(String[] args) {

        /* It creates StringTokenizer with specified string, delimiter and returnValue. If return value is true, delimiter characters are considered to be tokens. If it is false, delimiter characters serve to separate tokens. */

        //StringTokenizer st = new StringTokenizer("how,have,you,been", "," ,true );
        
        /* StringTokenizer st = new StringTokenizer("how,have,you,been", "," ,false );
        System.out.println(st.countTokens() + " Tokens");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println(" "); */
        
        /* StringTokenizer st3 = new StringTokenizer("JAVA : Code : String", " :", true);
        while (st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }  */  
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers to be added as a string with the specified delimeter: ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, ".");
        //StringTokenizer st = new StringTokenizer(str, " ");
        int sum = 0;
        while (st.hasMoreTokens()) {
            String s  = st.nextToken();
            int val = Integer.parseInt(s);
            sum = sum + val ;
        }
        System.out.println("The sum of the given numbers is:  "+ sum);

    }
}
