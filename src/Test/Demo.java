/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author user
 */
import java.sql.*;
public class Demo { 
    public static void main(String args[])
    {
        String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=true&verifyServerCertificate=false&allowMultiQueries=true";
        String uname = "root";
        String pwd = "12345a";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url);
            
            String q = "select * from student;select count(id) from student";
            
            Statement stmt = con.createStatement();
            
            
            ResultSet rs = stmt.executeQuery(q);
                        
            //System.out.println(rs.getClass());

            while(rs.next())
            {
                System.out.println(rs.getString(1)+" : "+rs.getString(2));
            }
            
            System.out.println(stmt.getMoreResults());
            
            rs = stmt.getResultSet();
            
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }
            
            con.close(); //resources remains open if not closed...
        }
        catch(Exception e )
        {
            System.out.println(e);
        } 
    }
}
