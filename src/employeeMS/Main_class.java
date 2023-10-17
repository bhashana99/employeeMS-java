package employeeMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image2 = new JLabel(i3);
        image2.setBounds(0,0,1120,630);
        add(image2);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(340,155,400,40);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        image2.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(335,275,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.black);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new AddEmployee();

            }
        });
        image2.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(565,275,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.black);

        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new ViewEmployee();
            }
        });
        image2.add(view);

        JButton remove = new JButton("Remove Employee");
        remove.setBounds(440,375,150,40);
        remove.setForeground(Color.WHITE);
        remove.setBackground(Color.black);

        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        image2.add(remove);


        setSize(1120,630);
        setLocation(250,100);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Main_class();
    }
}
