package employeeMS;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JTextField tusername;
    JPasswordField tpassword;
    JButton login;
    Login(){
//
        JLabel username = new JLabel("Username");
        username.setBounds(40,20,100,30);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150,20,150,30);
        add(tusername);

        JLabel password = new JLabel("Password");
        password.setBounds(40,70,100,30);
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(150,70,150,30);
        add(tpassword);

        login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        add(login);

        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }
}
