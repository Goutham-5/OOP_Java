
/*   USing swing create a window with 2 textfields and a button named reverse and when the button is pressed the string entered in the first text box gets reversed and gets displayed inthe second text field  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExam extends JFrame implements ActionListener {

    JButton jb;
    JTextField t1;
    JTextField t2;

    SwingExam(){

        setTitle("String Reversal");
        setLayout(new FlowLayout());

        jb = new JButton("Reverse");
        t1 = new JTextField(20);
        t2 = new JTextField(20);

        add(jb);
        add(t1);
        add(t2);

        jb.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ae){
        String str = t1.getText();
        String rev = new String("");
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            rev = arr[i]+rev;
        }
        t2.setText(rev);
    }

    public static void main(String[] args) {
        new SwingExam();
    }
}
