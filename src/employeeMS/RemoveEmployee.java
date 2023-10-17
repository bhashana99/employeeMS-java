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


        setSize(1000,400);
        setLocation(300,150);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
