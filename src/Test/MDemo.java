/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.sql.*;
import java.util.*;

/**
 *
 * @author user
 */
public class MDemo 
{
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
            
            String q = "select id from student1;select name from student1;select marks from student1";
            
            String a = "insert into student1 values(108,'qqq',35)";
            
            String s = "select id from student1;insert into student1 values(109,'pr',36)";

            Statement stmt = con.createStatement();        
            
            stmt.execute(s);
            
            ResultSet rs = stmt.executeQuery(q);
                  
            
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
