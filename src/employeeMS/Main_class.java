package employeeMS;

import javax.swing.*;
import java.awt.*;

public class Main_class extends JFrame {

    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(0,0,1120,630);
        add(image2);


        setSize(1120,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_class();
    }
}
