package PracticeClasses;

import DBConnection.DBConnetion;
import sun.tools.tree.ShiftRightExpression;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        AppiumCourse appiumCourse = new AppiumCourse("iTexico");
        /*appiumCourse.hello();
        System.out.println("the company name is: " + appiumCourse.getCompanyName());*/

        Foreach forEach = new Foreach();
        //forEach.foreachSyntax();
        appiumCourse.StringWorking("Equals");
        appiumCourse.StringWorking("EqualsIgnoreCase");
        appiumCourse.StringWorking("CompareTo");
        appiumCourse.StringWorking("compareToIgnoreCase");


        DBConnetion dbConnetion = new DBConnetion();
        String sql = "select * from personas";
        try{
            dbConnetion.connect();
            ResultSet results = dbConnetion.getStatement().executeQuery(sql);
            /*while((results.next())){
                String name = results.getString("nombre");
                byte age = results.getByte("edad");
                int id = results.getInt("idpersona");

                System.out.println(name  + " is " + age + " old");

            }*/
            results.close();
            dbConnetion.closeConnection();

        }catch (SQLException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }


    }


}
