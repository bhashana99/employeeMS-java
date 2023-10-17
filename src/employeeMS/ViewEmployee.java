package employeeMS;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewEmployee extends JFrame implements ActionListener {
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

        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);

        update = new JButton("Update");
        update.setBounds(120,70,80,20);
        update.addActionListener(this);
        add(update);

        print = new JButton("Print");
        print.setBounds(220,70,80,20);
        print.addActionListener(this);
        add(print);

        back = new JButton("Back");
        back.setBounds(320,70,80,20);
        add(back);



        setSize(900,700);
        setLayout(null);
        setLocation(300,100);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == search){
            String query = "SELECT * FROM employee WHERE empId = '"+choiceEMP.getSelectedItem()+"' ";
            try {
                conn c = new conn();
                ResultSet resultSet = c.stmt.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));
            }catch (Exception E){
                E.printStackTrace();

            }
        } else if (e.getSource() == print) {
            try {
                table.print();
            }catch (Exception E){
                E.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ViewEmployee();
    }
}
