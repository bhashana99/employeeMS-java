package employeeMS;

import javax.swing.*;
import java.awt.*;

public class AddEmployee extends JFrame {

    JTextField tname,tfname,taddress,tphone,tk,temail,tsalary,tdesignation;
    AddEmployee(){
        getContentPane().setBackground(new Color(163,255,188));

        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("serif", Font.BOLD,25));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,25));
        add(name);

        tname = new JTextField();
        tname.setBounds(200,150,150,30);
        name.setBackground(new Color(177,252,197));
        add(tname);


        setSize(900,700);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);
    }

    public static void main(String[] args) {
            new AddEmployee();
    }

}
