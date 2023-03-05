
//Program to read the lines froma file and to print the line number to the left of each line

import java.util.*;
import java.io.*;

public class FileExam {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        try {
            FileReader fr = new FileReader("trial.txt");
            BufferedReader br = new BufferedReader(fr);
            String str ;
            int count = 0;
            
            //Was giving wrong output
          /*   
            do{  
                if((str = br.readLine()) != null){
                    count++;
                    System.out.println(count +" "+ str); 
                }   
            }while((str = br.readLine()) != null); 
            */

            while((str = br.readLine()) != null){
                count++;
                System.out.println(count +" "+ str);
            }
            
            br.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        

    }
}
