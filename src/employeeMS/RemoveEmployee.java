package employeeMS;

import javax.swing.*;
import java.awt.*;

public class RemoveEmployee extends JFrame {

    RemoveEmployee(){

        JLabel label = new JLabel("Employee Id");
        label.setBounds(50,50,100,30);
        label.setFont(new Font("Tahoma",Font.BOLD,15));
        add(label);


        setSize(1000,400);
        setLocation(300,150);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
