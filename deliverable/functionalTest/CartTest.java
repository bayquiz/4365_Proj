/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javashoppingproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author edmon
 */
public class CartTest {
    
    public CartTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addProductToCartByPID method, of class Cart.
     */
    @Test
    public void testAddProductToCartByPID() {
        System.out.println("addProductToCartByPID");
        int pid = 0;
        Cart instance = new Cart();
        instance.addProductToCartByPID(pid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeProductByPID method, of class Cart.
     */
    @Test
    public void testRemoveProductByPID() {
        System.out.println("removeProductByPID");
        int pid = 0;
        Cart instance = new Cart();
        instance.removeProductByPID(pid);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCartTotal method, of class Cart.
     */
    @Test
    public void testCalculateCartTotal() {
        System.out.println("calculateCartTotal");
        Cart instance = new Cart();
        double expResult = 0.0;
        double result = instance.calculateCartTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkOut method, of class Cart.
     */
    @Test
    public void testCheckOut() {
        System.out.println("checkOut");
        Cart instance = new Cart();
        instance.checkOut();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
