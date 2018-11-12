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
import java.util.*;
import java.sql.*;
public class In {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=true&verifyServerCertificate=false&allowMultiQueries=true";
        String uname = "root";
        String pwd = "12345a";
        String name = sc.next();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url);
            
            String s = "select id,name from student1 where name = ";
            Statement stmt = con.createStatement();        
            
            stmt.execute(s);
            
            ResultSet rs = stmt.executeQuery(s);
                  
            
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }
            
            while(stmt.getMoreResults())
            {
            rs = stmt.getResultSet();
            
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }
            
            }
            
            con.close(); //resources remains open if not closed...
        }
        catch(Exception e )
        {
            System.out.println(e);
        } 
    }

    
}
