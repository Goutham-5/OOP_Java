import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ActionDemo extends JFrame implements ActionListener {
    JLabel l;
    ActionDemo()
    {
        
        setLayout(new FlowLayout());
        setSize(220,90);
        JButton jb=new JButton("Ok");
        JButton jb2=new JButton("Cancel");
        l=new JLabel("Please click a button");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        jb.addActionListener(this);
        jb2.addActionListener(this);
        
        add(jb);
        add(jb2);
        add(l);
        
        
        setVisible(true);
    }
    
        
     
        public void actionPerformed(ActionEvent ae)
        {
            String s=ae.getActionCommand();
            if(s.equals("Ok"))
               l.setText("Ok Pressed");
            if(s.equals("Cancel"))
                l.setText("Cancel Pressed");
            
                
        }
        public static void main(String args[])
     {
         new ActionDemo();
         
     }
        
    }
    
    
