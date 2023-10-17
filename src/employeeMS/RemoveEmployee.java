package employeeMS;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class RemoveEmployee extends JFrame {

    Choice choiceEmpId;
    RemoveEmployee(){

        JLabel label = new JLabel("Employee Id");
        label.setBounds(50,50,100,30);
        label.setFont(new Font("Tahoma",Font.BOLD,15));
        add(label);

        choiceEmpId = new Choice();
        choiceEmpId.setBounds(200,50,150,30);
        add(choiceEmpId);

        try {
            conn c = new conn();
            ResultSet resultSet = c.stmt.executeQuery("SELECT * FROM employee");
            while (resultSet.next()){
                choiceEmpId.add(resultSet.getString("empId"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel labelName = new JLabel("Name");
        labelName.setBounds(50,100,100,30);
        labelName.setFont(new Font("Tahoma",Font.BOLD,15));
        add(labelName);

        JLabel textName = new JLabel();
        textName.setBounds(250,100,100,30);
        add(textName);

        JLabel labelPhone = new JLabel("Phone");
        labelPhone.setBounds(50,150,100,30);
        labelPhone.setFont(new Font("Tahoma",Font.BOLD,15));
        add(labelPhone);

        JLabel textPhone = new JLabel();
        textPhone.setBounds(250,150,100,30);
        add(textPhone);

        JLabel labelEmail = new JLabel("E-Mail");
        labelEmail.setBounds(50,200,100,30);
        labelEmail.setFont(new Font("Tahoma",Font.BOLD,15));
        add(labelEmail);

        JLabel textEmail = new JLabel();
        textEmail.setBounds(250,200,100,30);
        add(textEmail);

        setSize(1000,400);
        setLocation(300,150);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
