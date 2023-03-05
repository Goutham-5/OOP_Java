
import java.io.*;
public class File3 {
    public static void main(String[] args)throws IOException {
        FileInputStream f1;
        try{
            f1 = new FileInputStream("trial.txt");
            int c;
            do {
                c = f1.read();
                if (c != -1 ) {
                    System.out.print((char)c);    //char is put inside the paranthesis and not c
                }
            }while (c != -1);
            f1.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }
    }
}
