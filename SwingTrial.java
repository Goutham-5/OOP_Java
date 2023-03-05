/* 

import javax.swing.*;
public class SwingTrial {
    public static void main(String[] args) {
        JFrame f = new JFrame(); //Creating instance of JFrame

        JButton b = new JButton("Click"); //Creating instance of JButton
        b.setBounds(130, 100, 100, 40);

        f.add(b); //Adding JButton to JFrame
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
    
} */

/* 
    // Using Inheritance and Constructor...
import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
public class SwingTrial extends JFrame{//inheriting JFrame  

    JFrame f = new JFrame("Swing Trial");  

    SwingTrial(){  //Constructor
        JButton b=new JButton("click");//create button  
        b.setBounds(130,100,100, 40);  
                
        add(b);//adding button on frame  
        setSize(400,500);  
        setLayout(new GridLayout());  // Can be given null
        setVisible(true);  
    }  
    public static void main(String[] args) {  
        SwingTrial s = new SwingTrial();  // Calling Constructor
    }
}  */

import java.io.*;
import java.util.*;

public class SwingTrial {

    public static void main(String[] args)throws IOException {
        try{

            /* FileReader fr = new FileReader("text.txt");
            BufferedReader br = new BufferedReader(fr); */

            //FileInputStream fr  = new FileInputStream("text.txt");

            /* int c;
            do{
                c = fr.read();
                if(c != -1){
                    System.out.print((char)c);
                }
            }while(c != -1); */

            /* String str;
            while((str = br.readLine()) != null){
                System.out.println(str);
            } */
            
            //br.close();
            //fr.close();

            Scanner sc = new Scanner(System.in);
            
            /* FileOutputStream fs = new FileOutputStream("text.txt");
            System.out.print("Enter the string to be written: ");
            String str = sc.nextLine();
            byte arr[] = str.getBytes();
            fs.write(arr); */


            FileWriter fw = new FileWriter("text.txt");
            System.out.print("Enter the string to be written: ");
            String str = sc.nextLine();
            /* int len = str.length();
            char arr[] = new char[20];
            str.getChars(0,len,arr,0); */
            char arr[] = str.toCharArray();
            fw.write(arr);

            System.out.println("Successfully Written");
            fw.close();

        }
        catch(FileNotFoundException fe){
            System.out.println(fe);
        }
    }
}

