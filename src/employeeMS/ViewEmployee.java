package employeeMS;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class ViewEmployee extends JFrame {
    JButton search,print,update,back;
    Choice choiceEMP;
    JTable table;



    ViewEmployee(){

        getContentPane().setBackground(new Color(230,230,230));

        JLabel searchLabel = new JLabel("Search Employee By Id");
        searchLabel.setBounds(20,20,150,20);
        add(searchLabel);

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

        JScrollPane jp = new JScrollPane(table);
        jp.setBounds(0,100,900,600);
        add(jp);

        JButton search = new JButton();



        setSize(900,700);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new ViewEmployee();
    }
}
