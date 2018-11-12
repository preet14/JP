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
public class Demo1 { 
    public static void main(String args[])
    {
        String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=true&verifyServerCertificate=false&allowMultiQueries=true";
        String uname = "root";
        String pwd = "12345a";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url);
            
            String q = "select id from student1;select name from student1;select marks from student1";
            
            Statement stmt = con.createStatement();
            
            
            ResultSet rs = stmt.executeQuery(q);
                        
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }
            
            System.out.println(stmt.getMoreResults());
            
            rs = stmt.getResultSet();
            
            while(rs.next())
            {
                System.out.println(rs.getString(1));
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
