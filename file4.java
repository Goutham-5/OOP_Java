
/*
 If FileWriter is used convert the string to character array and use getChars method
 If FileOutputStream is used convert the string to byte array  using getBytes() method
 */

import java.io.*;
import java.util.*;

public class file4 {
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        try{
            //FileWriter f = new FileWriter("demo.txt");
            FileOutputStream f = new FileOutputStream("demo.txt");
            System.out.print("Enter the contents of the file: ");
            String str = sc.nextLine();
            /* int len = str.length();
            char arr[] = new char[len];
            str.getChars(0, len, arr, 0);
            f.write(arr); */

            byte arr1[] = str.getBytes();
            f.write(arr1);

            f.close();
        }

        catch(FileNotFoundException fe){
            System.out.println("File not found");
        }

        finally{
            System.out.println("Successfully Written");
        }
    }
}
