package employeeMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement stmt;

    public conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems_java","root","sql9136");
            stmt = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
