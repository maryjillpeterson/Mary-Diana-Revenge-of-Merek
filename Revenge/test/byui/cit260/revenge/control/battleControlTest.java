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
        assertEquals(expResult,result,0.01);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    
    }
}
