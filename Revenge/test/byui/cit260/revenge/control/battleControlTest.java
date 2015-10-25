/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marypeterson dianahughes
 */
public class battleControlTest {
    
    public battleControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateHealth method, of class battleControl.
     */
    @Test
    public void testCalculateHealth() {
        
        System.out.println("calculateHealth");
        /**************************
        * Test case #1        
        **************************/
        
        System.out.println("\tTest case #1");
        double playerStrength = 15.0;
        double damage = 3.0;
        double expResult = 12.0;
        battleControl instance = new battleControl();
        double result = instance.calculateHealth(playerStrength, damage);
        assertEquals(expResult,result,0.0);
        
        /**************************
        *Test case #2        
        **************************/
        
        System.out.println("\tTest case #2");
        playerStrength = -2.0;
        damage = 1.0;
        expResult = -1.0;
        result = instance.calculateHealth(playerStrength, damage);
        assertEquals(expResult, result, 0.0);
    
        /**************************
        *Test case #3        
        **************************/
        
        System.out.println("\tTest case #3");
        playerStrength = 25;
        damage = 4;
        expResult = -1;
        result = instance.calculateHealth(playerStrength, damage);
        assertEquals(expResult, result, 0.0);
    
        /**************************
        *Test case #4        
        **************************/
        
        System.out.println("\tTest case #4");
        playerStrength = 20;
        damage = 0;
        expResult = 20;
        result = instance.calculateHealth(playerStrength, damage);
        assertEquals(expResult, result, 0.0);
    
        /**************************
        *Test case #5        
        **************************/
        
        System.out.println("\tTest case #5");
        playerStrength = 0;
        damage = 5;
        expResult = -1;
        result = instance.calculateHealth(playerStrength, damage);
        assertEquals(expResult, result, 0.0);

       
    }

    /**
     * Test of validCharge method, of class battleControl.
     */
    @Test
    public void testValidCharge() {
        System.out.println("validCharge");
        
        /***********************
         * Test case #6
         ***********************/
        System.out.println("\tTest case #6");
        int turnNumber = 3;
        int lastCharge = 0;
        battleControl instance = new battleControl();
        boolean expResult = true;
        boolean result = instance.validCharge(turnNumber, lastCharge);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /***********************
         * Test case #7
         ***********************/
        System.out.println("\tTest case #7");
        turnNumber = 3;
        lastCharge = 1;
        expResult = false;
        result = instance.validCharge(turnNumber, lastCharge);
        assertEquals(expResult, result);
        
        /***********************
         * Test case #8
         ***********************/
        System.out.println("\tTest case #8");
        turnNumber = 10;
        lastCharge = 3;
        expResult = true;
        result = instance.validCharge(turnNumber, lastCharge);
        assertEquals(expResult, result);
        
        /***********************
         * Test case #9
         ***********************/
        System.out.println("\tTest case #9");
        turnNumber = 0;
        lastCharge = 3;
        expResult = false;
        result = instance.validCharge(turnNumber, lastCharge);
        assertEquals(expResult, result);
        
        /***********************
         * Test case #10
         ***********************/
        System.out.println("\tTest case #10");
        turnNumber = 6;
        lastCharge = 1;
        expResult = true;
        result = instance.validCharge(turnNumber, lastCharge);
        assertEquals(expResult, result);
    }
}
