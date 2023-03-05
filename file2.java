
/*
Program to read from a file and to count the number of: words, lines and characters from the given text file                   
*/
import java.io.*;
import java.util.*;
public class file2 {
    public static void main(String args[])throws IOException{
        System.out.println(""); 
        System.out.println(".....Reading from the file.....");
        System.out.println("");
        int lineCount = 0, wordCount = 0, charCount = 0, sentenceCount = 0;
        FileReader fr = new FileReader("text.txt");
        BufferedReader br = new BufferedReader(fr);
        try{
            
            String str ;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                lineCount++;

                String arr[] = str.split(" ");
                wordCount += arr.length; 
                System.out.println(Arrays.toString(arr));       //arr.length to find array length without()

                
                for (String string : arr) {
                    charCount += string.length();
                }

                String arr1[] = str.split("[!?.:]+");
                sentenceCount = arr1.length;
                System.out.println(Arrays.toString(arr1));
            }
        }
        catch(FileNotFoundException fe){
            System.out.println("File not found exception");
        }

        System.out.println("");
        System.out.println("The given file has "+lineCount+" lines");

        System.out.println("");
        System.out.println("The given file has "+wordCount+" words");

        System.out.println("");
        System.out.println("The given file has "+charCount+" characters");

        System.out.println("");
        System.out.println("The given file has "+sentenceCount+" Sentences");        

    }
}
