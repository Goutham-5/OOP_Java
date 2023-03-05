

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingSum extends JFrame implements ActionListener{

        JLabel f;
        JLabel s;
        JButton jb;
        JTextField t1;
        JTextField t2;
        JLabel jres;

        SwingSum(){
            
            setSize(220,90);
            setTitle("Sum Finder");
            setLayout(new GridLayout());

            JLabel f = new JLabel("First Number");
            JLabel s = new JLabel("Second Number");
            JButton jb = new JButton("Sum");
            JTextField t1 = new JTextField(20);
            JTextField t2 = new JTextField(20);
            JLabel jres = new JLabel("Final Result will be shown here") ;

            add(f);
            add(s);
            add(jb);
            add(t1);
            add(t2);
            add(jres);

            jb.addActionListener(this);

            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);

        }

        public void actionPerformed(ActionEvent ae){

            int num1 = Integer.parseInt(t1.getText());      
            int num2 = Integer.parseInt(t2.getText());
            int sum = num1+num2;

            String res = Integer.toString(sum);
            
            /*      To convert Integer to String 
            int i=10;  
            String s=Integer.toString(i); 
            */ 
            jres.setText(res);
        }

        public static void main(String[] args) {
            new SwingSum();
        }
}