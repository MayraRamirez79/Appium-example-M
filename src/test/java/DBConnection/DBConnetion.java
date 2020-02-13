package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnetion {
    /*public void hello(){
        System.out.println("HEllo");
    }
    public void hell(){
        this.hello();
        this.hello();
    }*/

    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    //final String DB_PATH = "jdbc:mysql://localhost:3306/test";
    final String DB_PATH = "jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


    String user = "root";
    String pass = "admin";
    Connection connection = null;
    Statement statement = null;

    public DBConnetion(){

    }
    public DBConnetion(String user, String pass){
        this.user = user;
        this.pass = pass;
    }
    public void connect() throws SQLException, Exception {
        Class.forName(DRIVER);
        System.out.println("Connecting...");
        connection = DriverManager.getConnection(DB_PATH, user, pass);
        statement = connection.createStatement();

    }

    public void closeConnection() throws SQLException, Exception{
        statement.close();
        connection.close();
    }

    public Statement getStatement(){
        return statement;
    }
    public Connection getConnection(){
        return connection;
    }
    public void setCredentials(String user, String pass){
        this.user = user;
        this.pass = pass;
    }



}
