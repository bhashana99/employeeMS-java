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
        name.setBounds(250,120,150,30);
        name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(name);

        tname = new JTextField();
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

        tdob = new JDateChooser();
        tdob.setBounds(380,320,150,30);
        tdob.setBackground(new Color(240, 240, 240));
        add(tdob);

        JLabel education = new JLabel("Education");
        education.setBounds(250,360,150,30);
        education.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(education);

        String items[]={"PHD","MSC","MBA","BSc","B.Tech","B.COM"};

        Boxeducation = new JComboBox(items);
        Boxeducation.setBackground(new Color(240, 240, 240));
        Boxeducation.setBounds(380,360,150,30);
        add(Boxeducation);

        JLabel nic = new JLabel("NIC");
        nic.setBounds(250,400,150,30);
        nic.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(nic);

        tnic = new JTextField();
        tnic.setBounds(380,400,250,30);
        tnic.setBackground(new Color(240, 240, 240));
        add(tnic);

        JLabel empid = new JLabel("Employee Id");
        empid.setBounds(300,450,150,30);
        empid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(empid);

        tempid = new JLabel("   "+number);
        tempid.setBounds(420,450,150,30);
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
