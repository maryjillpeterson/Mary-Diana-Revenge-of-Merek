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
        assertEquals(expResult,result,12.0);
        
        /**************************
        *Test case #2        
        **************************/
        
        System.out.println("\tTest case #2");
        playerStrength = -2.0;
        damage = 1.0;
        expResult = -1.0;
        result = instance.calculateHealth(playerStrength, damage);
        assertEquals(expResult, result, -1.0);
    
        /**************************
        *Test case #3        
        **************************/
        
        System.out.println("\tTest case #3");
        playerStrength = 25;
        damage = 4;
        expResult = 21;
        result = instance.calculateHealth(playerStrength, damage);
        assertEquals(expResult, result, 21);
    
        /**************************
        *Test case #4        
        **************************/
        
        System.out.println("\tTest case #4");
        playerStrength = 20;
        damage = 0;
        expResult = 20;
        result = instance.calculateHealth(playerStrength, damage);
        assertEquals(expResult, result, 20);
    
        /**************************
        *Test case #5        
        **************************/
        
        System.out.println("\tTest case #5");
        playerStrength = 0;
        damage = 5;
        expResult = -5;
        result = instance.calculateHealth(playerStrength, damage);
        assertEquals(expResult, result, -5);

       
    }
}
