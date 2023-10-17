package employeeMS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class RemoveEmployee extends JFrame {

    Choice choiceEMPID;
    JButton delete,back;
    RemoveEmployee(){

        JLabel label = new JLabel("Employee ID");
        label.setBounds(50,50,100,30);
        label.setFont(new Font("Tahoma", Font.BOLD,15));
        add(label);

        choiceEMPID = new Choice();
        choiceEMPID.setBounds(200,50,150,30);
        add(choiceEMPID);

        try{
            conn c = new conn();
            ResultSet resultSet = c.stmt.executeQuery("select * from employee");
            while (resultSet.next()){
                choiceEMPID.add(resultSet.getString("empId"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(50,100,100,30);
        labelName.setFont(new Font("Tahoma", Font.BOLD,15));
        add(labelName);

        JLabel textName = new JLabel();
        textName.setBounds(200,100,200,30);
        add(textName);

        JLabel labelPhone = new JLabel("Phone");
        labelPhone.setBounds(50,150,100,30);
        labelPhone.setFont(new Font("Tahoma", Font.BOLD,15));
        add(labelPhone);

        JLabel textPhone = new JLabel();
        textPhone.setBounds(200,150,200,30);
        add(textPhone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50,200,100,30);
        labelemail.setFont(new Font("Tahoma", Font.BOLD,15));
        add(labelemail);

        JLabel textEmail = new JLabel();
        textEmail.setBounds(200,200,200,30);
        add(textEmail);


        try {
            conn c = new conn();
            String selectedEmpID = choiceEMPID.getSelectedItem();
            ResultSet resultSet = c.stmt.executeQuery("SELECT * FROM employee WHERE empId = '"+selectedEmpID+"' ");
//            System.out.println(choiceEMPID);

            while (resultSet.next()){
                textName.setText(resultSet.getString("name"));
                textEmail.setText(resultSet.getString("email"));
                textPhone.setText(resultSet.getString("phone"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        choiceEMPID.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    conn c = new conn();
                    String selectedEmpID = choiceEMPID.getSelectedItem();
                    ResultSet resultSet = c.stmt.executeQuery("SELECT * FROM employee WHERE empId = '"+selectedEmpID+"' ");
//            System.out.println(choiceEMPID);

                    while (resultSet.next()){
                        textName.setText(resultSet.getString("name"));
                        textEmail.setText(resultSet.getString("email"));
                        textPhone.setText(resultSet.getString("phone"));
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        delete = new JButton("Delete");
        delete.setBounds(80,300,100,30);
        delete.setBackground(Color.black);
        delete.setForeground(Color.WHITE);
        add(delete);

        back = new JButton("Back");
        back.setBounds(200,300,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        add(back);

        setSize(1000,400);
        setLocation(300,150);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
