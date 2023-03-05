
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * SwingFile
 */
public class SwingFile extends JFrame implements ActionListener{

    JLabel l;
    JButton b0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton read;
    JButton stop;

    SwingFile(){
        setTitle("Swing and File");
        setLayout(null);

        l = new JLabel();
        b0 = new JButton("0");
        b0.setBounds(100, 140, 50, 30);
        b1 = new JButton("1");
        b1.setBounds(150, 140, 50, 30);
        b2 = new JButton("2");
        b2.setBounds(200, 140, 50, 30);
        b3 = new JButton("3");
        b3.setBounds(250, 140, 50, 30);
        b4 = new JButton("4");
        b4.setBounds(300, 140, 50, 30);
        b5 = new JButton("5");
        b5.setBounds(100, 170, 50, 30);
        b6 = new JButton("6");
        b6.setBounds(150, 170, 50, 30);
        b7 = new JButton("7");
        b7.setBounds(200, 170, 50, 30);
        b8 = new JButton("8");
        b8.setBounds(250, 170, 50, 30);
        b9 = new JButton("9");
        b9.setBounds(300, 170, 50, 30);
        
        stop = new JButton("Stop");
        stop.setBounds(500, 200, 50, 30);
        read = new JButton("Read");
        read.setBounds(500, 200, 50, 30);

        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(stop);
        add(read);
        add(l);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        //t.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String str;
        for (int i = 0; i < 9; i++) {
            if (rootPaneCheckingEnabled) {
                
            }
            l.setText()
        }
        if(ae.getSource() == read){
            try{
                String x = t.getText();
                //int val = Integer.parseInt(x);
                FileWriter fw = new FileWriter("SwingFile.txt");
                fw.write(x);
                
            }
            catch(FileNotFoundException fe){
                System.out.println(fe);
            }
        }
        
    }

    public static void main(String[] args)throws IOException {
        new SwingFile();
        
    }
}