package employeeMS;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    JTextField tusername;
    JPasswordField tpassword;
    JButton login,back;
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

        back = new JButton("BACK");
        back.setBounds(150,180,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        add(back);

        ImageIcon i12 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i22 = i12.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i32 = new ImageIcon(i22);
        JLabel image22 = new JLabel(i32);
        image22.setBounds(350,0,600,400);
        add(image22);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(0,0,600,300);
        add(image2);


        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }
}
