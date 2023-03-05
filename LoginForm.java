
    // Login Form using Swing
import java.awt.*;
import javax.swing.*;

public class LoginForm extends JFrame{
    
    JLabel usernamLabel; //Instance of JLabel
    JTextField usernameField; //Instance of JTextField
    JLabel passwordLabel;
    JPasswordField passwordField;
    JButton loginButton;

    LoginForm(){

        setTitle("Login Form"); //set the JFrame title 
        setLayout(new FlowLayout());
        
        JLabel usernamLabel = new JLabel("UserName: ");
        JTextField usernameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        add(usernamLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);

        setSize(300, 150);
    }

    public static void main(String[] args) {
        LoginForm l = new LoginForm();
        l.setVisible(true);
    }
}
