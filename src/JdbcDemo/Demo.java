/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JdbcDemo;

/**
 *
 * @author user
 */
public class Demo {
    public static void main(String[] args) {
        
        Student s = new Student();
        
          
        
        
        
        
        
        
                                            StudentDAO sd = new StudentDAO();
        
          s.setId(100);
//        s.setName("abc");
//        if(sd.save(s))
//        {
//            System.out.println("Successfull");
//        }
//        else
//        {
//            System.out.println("Not");
//        }
        if(sd.update(s))
        {
            System.out.println("Updated");
        }
        else
        {
            System.out.println("Not Updted");
        }
    }
}
