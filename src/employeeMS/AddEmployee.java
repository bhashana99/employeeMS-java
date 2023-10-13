package employeeMS;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class AddEmployee extends JFrame {

    Random ram = new Random();
    int number = ram.nextInt(999999);

    JTextField tname,taddress,tphone,temail,tsalary,tnic;
    JLabel tempid;
    JDateChooser tdob;
    JComboBox Boxeducation;



    AddEmployee(){
        getContentPane().setBackground( Color.LIGHT_GRAY);

        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("serif", Font.BOLD,25));
        add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(50,150,150,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(name);

        tname = new JTextField();
        tname.setBounds(200,150,150,30);
        tname.setBackground(new Color(240, 240, 240));
        add(tname);

        JLabel email = new JLabel("E-Mail");
        email.setBounds(50,190,150,30);
        email.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(email);

        temail = new JTextField();
        temail.setBounds(200,190,150,30);
        temail.setBackground(new Color(240, 240, 240));
        add(temail);

        JLabel address = new JLabel("Address");
        address.setBounds(50,230,150,30);
        address.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(address);

        taddress = new JTextField();
        taddress.setBounds(200,230,150,30);
        taddress.setBackground(new Color(240, 240, 240));
        add(taddress);

        JLabel phone = new JLabel("Phone Number");
        phone.setBounds(50,270,150,30);
        phone.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(phone);

        tphone = new JTextField();
        tphone.setBounds(200,270,150,30);
        tphone.setBackground(new Color(240, 240, 240));
        add(tphone);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(50,310,150,30);
        salary.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(salary);

        tsalary = new JTextField();
        tsalary.setBounds(200,310,150,30);
        tsalary.setBackground(new Color(240, 240, 240));
        add(tsalary);

        JLabel dob = new JLabel("Date of Birth");
        dob.setBounds(50,350,150,30);
        dob.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(dob);

        tdob = new JDateChooser();
        tdob.setBounds(200,350,150,30);
        tdob.setBackground(new Color(240, 240, 240));
        add(tdob);

        JLabel education = new JLabel("Education");
        education.setBounds(50,390,150,30);
        education.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(education);

        String items[]={"PHD","MSC","MBA","BSc","B.Tech","B.COM"};

        Boxeducation = new JComboBox(items);
        Boxeducation.setBackground(new Color(240, 240, 240));
        Boxeducation.setBounds(200,390,150,30);
        add(Boxeducation);

        JLabel nic = new JLabel("NIC");
        nic.setBounds(50,430,150,30);
        nic.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(nic);

        tnic = new JTextField();
        tnic.setBounds(200,430,150,30);
        tnic.setBackground(new Color(240, 240, 240));
        add(tnic);

        JLabel empid = new JLabel("Employee Id");
        empid.setBounds(50,470,150,30);
        empid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(empid);

        tempid = new JLabel(""+number);
        tempid.setBounds(200,470,150,30);
        tempid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        tempid.setForeground(Color.red);
        add(tempid);


        setSize(900,700);
        setLayout(null);
        setLocation(300,50);
        setVisible(true);
    }

    public static void main(String[] args) {
            new AddEmployee();
    }

}
