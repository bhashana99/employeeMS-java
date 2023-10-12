package employeeMS;

import javax.swing.*;

public class Login extends JFrame {

    Login(){
//
        JLabel username = new JLabel("Username");
        username.setBounds(40,20,100,30);
        add(username);

        JLabel password = new JLabel("Password");
        password.setBounds(40,70,100,30);
        add(password);

        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }
}
