
/* Write a program that displays a simple form with two text fields, a label, and a button. When the button is clicked, the program should display the values entered in the text fields in the label. */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Qn2 extends JFrame implements ActionListener{

    //JFrame jf = new JFrame();
    JTextField txt1;
    JTextField txt2;
    JButton jb;
    JLabel jl;
    String str1, str2;
    
    public Qn2(){

        setTitle("Display text field in the label");
        setSize(220 ,90);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txt1 = new JTextField(25);
        txt2 = new JTextField(25);

        jb = new JButton("Result");

        jl = new JLabel("label");
        jl.setPreferredSize(new Dimension(200, 30));

        jb.addActionListener(this);

        add(txt1);
        add(txt2);
        add(jb);
        add(jl);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){

        str1 = txt1.getText();
        str2 = txt2.getText();
        
        jl.setText(str1 + " " + str2);
    }

    public static void main(String[] args) {
        new Qn2();
    }
}