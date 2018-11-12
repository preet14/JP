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
public class MyP { 
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
            
            String a = "insert into student1 values(106,'q1',30)";

            Statement stmt = con.createStatement();        
            
            int x = stmt.executeUpdate(a);
            
            ResultSet rs = stmt.executeQuery(q);
                        
            ResultSetMetaData rsmd = rs.getMetaData();
            
            DatabaseMetaData dbmd = con.getMetaData();
            
            System.out.println(dbmd.getClass().getName());
            
            System.out.println(dbmd.getDatabaseMajorVersion());
            
            System.out.println(dbmd.getDatabaseMinorVersion());
            
            System.out.println(dbmd.getDatabaseProductName());
            
            System.out.println(dbmd.getDriverMajorVersion());
            
            System.out.println(dbmd.getDriverMinorVersion());
            
            System.out.println(dbmd.getDriverName());
            
            System.out.println(dbmd.getJDBCMajorVersion());
            
            System.out.println(dbmd.getJDBCMinorVersion());
//            System.out.println(rsmd.isAutoIncrement(1));
//            
//            System.out.println(rsmd.isNullable(1));
//            
//            System.out.println(rsmd.isReadOnly(1));
//            
//            System.out.println(rsmd.getColumnTypeName(1));
//                        
//            while(rs.next())
//            {
//                System.out.println(rs.getString(1));
//            }
//            
//            //System.out.println(stmt.getMoreResults());
//            
//            while(stmt.getMoreResults())
//            {
//                
//            rs = stmt.getResultSet();
//            
//            rsmd = rs.getMetaData();
//            
//            System.out.println(rsmd.getColumnTypeName(1));
//
//            
//            while(rs.next())
//            {
//                System.out.println(rs.getString(1));
//            }
//            }
            con.close(); //resources remains open if not closed...
        }
        catch(Exception e )
        {
            System.out.println(e);
        } 
    }
}
