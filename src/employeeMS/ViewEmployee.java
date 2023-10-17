package employeeMS;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class ViewEmployee extends JFrame {
    Choice choiceEMP;
    JTable table;

    ViewEmployee(){

        getContentPane().setBackground(new Color(230,230,230));

        JLabel search = new JLabel("Search Employee By Id");
        search.setBounds(20,20,150,20);
        add(search);

        choiceEMP = new Choice();
        choiceEMP.setBounds(180,20,150,20);
        add(choiceEMP);

        try {
            conn c = new conn();
            ResultSet resultSet = c.stmt.executeQuery("SELECT * FROM employee");
            while (resultSet.next()){
                choiceEMP.add(resultSet.getString("empId"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        table = new JTable();
        try{
            conn c = new conn();
            ResultSet resultSet = c.stmt.executeQuery("SELECT * FROM employee");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        setSize(900,700);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new ViewEmployee();
    }
}
