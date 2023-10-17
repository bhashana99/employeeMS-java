package employeeMS;

import javax.swing.*;
import java.awt.*;

public class ViewEmployee extends JFrame {

    ViewEmployee(){

        getContentPane().setBackground(new Color(50,120,200));

        setSize(900,700);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new ViewEmployee();
    }
}
