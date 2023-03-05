
import java.io.*;
import java.util.*;
public class Files {

    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
            int flag = 0;
            while(flag == 0){
                System.out.println("");
                System.out.println("Enter the operation to be performed: \n1.Write \n2.Read \n3.Exit");
                System.out.print("Choose the operation to be performed: ");
                int op = sc.nextInt();
                switch(op){
                    case 1:
                        try{
                            /* FileOutputStream f1 = new FileOutputStream("newFile.txt");
                            System.out.println("Enter the string to be written");
                            String str = sc.nextLine();
                            sc.nextLine();
                            byte arr[] = str.getBytes();
                            f1.write(arr);
                            f1.close(); */
                            FileWriter f2 = new FileWriter("newFile.txt");
                            System.out.println("Enter the string to be written");
                            String str = sc.nextLine();
                            sc.nextLine();
                            char arr[] = new char[20];
                            int len = str.length();
                            str.getChars(0,len,arr,0);
                            f2.write(arr);
                            f2.close();
                        }
                        catch(FileNotFoundException fe){
                            System.out.println("File not found");
                        }
                        break;
                    case 2:
                        try{
                            FileInputStream f2 = new FileInputStream("newFile.txt");
                            int c;
                            do{
                                c = f2.read();
                                if(c != -1){
                                    System.out.print((char)c);
                                }
                            }while (c != -1) ;
                            f2.close();
                        }
                        catch(FileNotFoundException fe){
                            System.out.println("File not found");
                        }
                        break;
                    case 3:
                        flag = 1;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
        }
    }
    
}