
/*
    Program to read and write to a file
*/

// use null for readLine() methods & -1 for read() method
// use FileWriter for appending(include the boolean value along with file name for appending)
// Convert String to character array along with getChars() function while appending to a file using FileWriter


import java.io.*;
import java.util.*;
class file1{
    public static void main(String args[]) throws IOException{
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        while (flag == 1) {
            System.out.println("\nEnter the operation to be performed :\n1.Read \n2.Write \n3.Exit"); 
            int op = sc.nextInt();
            switch(op){
                //Read
                case 1:
                    //FileInputStream f1 ;
                    //int c;
                    try{
                        //f1 = new FileInputStream("text.txt");
                        
                        FileReader fr = new FileReader("text.txt");
                        BufferedReader br = new BufferedReader(fr);
                        /*
                            read() method
                        do{
                            c = br.read();
                            if (c != -1) {
                                System.out.print((char)c);
                            }
                        }while (c != -1);
                        */
                        //Using readLine methods

                        String s;
                        while((s = br.readLine()) != null)
                        {
                        System.out.println(s);
                        }
                        br.close();

                    }

                    catch(FileNotFoundException fe){
                        System.out.println("File not found");
                    }
                    break;
                
                //Write
                case 2:
                    //FileOutputStream f2 = new FileOutputStream("text.txt");
                    
                    System.out.print("Enter the string to be written: ");
                    String str = sc.nextLine();
                    str = sc.nextLine();
                    
                    try{
                        // byte arr[] = str.getBytes();
                        // f2.write(arr);
                        // f2.close();
                        int len = str.length();
                        
                        //Appending to the given file  
                        FileWriter f2 = new FileWriter("text.txt", true);
                        char arr[] = new char[len];
                        str.getChars(0, len, arr, 0);
                        f2.write(arr);
                        f2.close();
                    }
                    catch(FileNotFoundException fe){
                        System.out.println("File not found");
                    }
                    break;

                case 3:
                    System.out.println("File exitted");
                    flag = 0 ;
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}


