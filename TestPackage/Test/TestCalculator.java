/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TestCalculator {
    
    public TestCalculator() {
        System.out.println("Constructor called");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Beforeclass called");
    }
    
    @AfterClass
    public static void tearDownClass() {
       System.out.println("Afterclass called");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before called");
    }
    
    @After
    public void tearDown() 
    {
        System.out.println("After called");
    }
//
//    // TODO add test methods here.
//    // The methods must be annotated with annotation @Test. For example:
//    //
//    // @Test
//    // public void hello() {}
    @Test
    public void testAdd()
    {
        Calculator obj = new Calculator();
        Assert.assertEquals(10,obj.add(8,2));
    }
}
