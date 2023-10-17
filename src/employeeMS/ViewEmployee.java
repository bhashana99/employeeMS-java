package employeeMS;

import javax.swing.*;
import java.awt.*;

public class ViewEmployee extends JFrame {

    ViewEmployee(){

        getContentPane().setBackground(new Color(230,230,230));

        JLabel search = new JLabel("Search Employee By Id");
        search.setBounds(20,20,150,20);
        add(search);

        setSize(900,700);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new ViewEmployee();
    }
}
