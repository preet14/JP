/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcDemo;

import java.sql.*;
import java.util.*;
/**
 *
 * @author user
 */
public class StudentDAO 
{
    Scanner sc = new Scanner(System.in);
    public boolean save(Student s)
    {
        boolean flag = true;
        String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=true&verifyServerCertificate=false&allowMultiQueries=true";
        try
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection(url);
           String qr = "insert into  stu values(?,?)";
           
           PreparedStatement pstmt = con.prepareStatement(qr);
           
           pstmt.setInt(1,s.getId());
           
           pstmt.setString(2,s.getName());
           
           int i = pstmt.executeUpdate();
        }
        catch(Exception e)
        {
                 flag = false;
                 System.out.println(e);   
        }
        return flag;
    }
    public boolean update(Student s)
    {
        boolean flag = true;
        String url = "jdbc:mysql://localhost:3306/testdemo?user=root&password=12345a&useSSL=true&verifyServerCertificate=false&allowMultiQueries=true";
        try
        {
           Connection con = DriverManager.getConnection(url);
           String qr = "update stu set name = ? where id = ?";
           
           PreparedStatement pstmt = con.prepareStatement(qr);
           
           pstmt.setInt(2,100);
           
           String s1 = sc.next();
           pstmt.setString(1,s1);
           
           int i = pstmt.executeUpdate();    
        }
        catch(Exception e)
        {
            flag = false;
            System.out.println(e);
        }
        
        return flag;
    }
}
