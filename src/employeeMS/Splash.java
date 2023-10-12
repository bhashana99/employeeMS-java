package employeeMS;

import javax.swing.*;

public class Splash extends JFrame {

    Splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));


        setSize(1170,650);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Splash();

    }
}
