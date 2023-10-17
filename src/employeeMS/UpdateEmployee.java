package employeeMS;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateEmployee extends JFrame implements ActionListener {

    JTextField taddress,tphone,temail,tsalary,teducation;
    JLabel tempid;
    JButton add,back;
    String number;

    UpdateEmployee(String number){

        this.number = number;

        getContentPane().setBackground( Color.LIGHT_GRAY);

        JLabel heading = new JLabel("Update Employee Details");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("serif", Font.BOLD,25));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(250,120,150,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(name);

        JLabel tname = new JLabel();
        tname.setBounds(380,120,250,30);
        tname.setBackground(new Color(240, 240, 240));
        add(tname);

        JLabel email = new JLabel("E-Mail");
        email.setBounds(250,160,150,30);
        email.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(email);

        temail = new JTextField();
        temail.setBounds(380,160,250,30);
        temail.setBackground(new Color(240, 240, 240));
        add(temail);

        JLabel address = new JLabel("Address");
        address.setBounds(250,200,150,30);
        address.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(address);

        taddress = new JTextField();
        taddress.setBounds(380,200,250,30);
        taddress.setBackground(new Color(240, 240, 240));
        add(taddress);

        JLabel phone = new JLabel("Telephone");
        phone.setBounds(250,240,150,30);
        phone.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(380,240,250,30);
        tphone.setBackground(new Color(240, 240, 240));
        add(tphone);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(250,280,150,30);
        salary.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(380,280,250,30);
        tsalary.setBackground(new Color(240, 240, 240));
        add(tsalary);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(250,320,150,30);
        dob.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(dob);

        JLabel tdob = new JLabel();
        tdob.setBounds(380,320,150,30);
        dob.setFont(new Font("Tahoma",Font.BOLD,20));
        add(tdob);

        JLabel education = new JLabel("Education");
        education.setBounds(250,360,150,30);
        education.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(education);

        teducation = new JTextField();
        teducation.setBounds(380,360,250,30);
        teducation.setBackground(new Color(240, 240, 240));
        add(teducation);


        JLabel nic = new JLabel("NIC");
        nic.setBounds(250,400,150,30);
        nic.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(nic);

        JLabel tnic = new JLabel();
        tnic.setBounds(380,400,250,30);
        tnic.setBackground(new Color(240, 240, 240));
        add(tnic);

        JLabel empid = new JLabel("Employee Id");
        empid.setBounds(300,450,150,30);
        empid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(empid);

        tempid = new JLabel();
        tempid.setBounds(420,450,150,30);
        tempid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        tempid.setForeground(Color.red);
        add(tempid);

        try {
            conn c = new conn();
            String query = "SELECT * FROM employee WHERE empId = '"+number+"' ";
        }catch (Exception e){
            e.printStackTrace();
        }

        add = new JButton("ADD");
        add.setBounds(250,530,150,30);
        add.setBackground(new Color(40,167,69));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBounds(550,530,150,30);
        back.setBackground(new Color(255,193,7));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(900,700);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new UpdateEmployee("");
    }
}
