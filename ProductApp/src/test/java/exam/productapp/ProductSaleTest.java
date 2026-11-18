/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package exam.productapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tumithobejane
 */
public class ProductSaleTest {
    
    public ProductSaleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getCustomerName method, of class ProductSale.
     */
    @Test
    public void testGetCustomerName() {
        System.out.println("getCustomerName");
        ProductSale instance = null;
        String expResult = "";
        String result = instance.getCustomerName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductName method, of class ProductSale.
     */
    @Test
    public void testGetProductName() {
        System.out.println("getProductName");
        ProductSale instance = null;
        String expResult = "";
        String result = instance.getProductName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ProductSale.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ProductSale instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateVAT method, of class ProductSale.
     */
    @Test
    public void testCalculateVAT() {
        System.out.println("calculateVAT");
        ProductSale instance = null;
        double expResult = 0.0;
        double result = instance.calculateVAT();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateCommission method, of class ProductSale.
     */
    @Test
    public void testCalculateCommission() {
        System.out.println("calculateCommission");
        ProductSale instance = null;
        double expResult = 0.0;
        double result = instance.calculateCommission();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateTotal method, of class ProductSale.
     */
    @Test
    public void testCalculateTotal() {
        System.out.println("calculateTotal");
        ProductSale instance = null;
        double expResult = 0.0;
        double result = instance.calculateTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
