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
 * @author chadepeterson
 */
public class questControlTest {
    
    public questControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calculateVolume method, of class questControl.
     */
    @Test
    public void testCalculateVolume() {
        System.out.println("calculateVolume");
        
        /**************************
        * Test case #1        
        **************************/
        
        System.out.println("\tTest case #1");
        double radius = 15.0;
        double height = 40.0;
        questControl instance = new questControl();
        double expResult = 28274.33;
        double result = instance.calculateVolume(radius, height);
        assertEquals(expResult, result, 28174.33);
        
        /**************************
        * Test case #2        
        **************************/
        
        System.out.println("\tTest case #2");
        radius = 20.0;
        height = 62.0;
        expResult = 77872;
        result = instance.calculateVolume(radius, height);
        assertEquals(expResult, result, 77872);
        
        /**************************
        * Test case #3        
        **************************/
        
        System.out.println("\tTest case #2");
        radius = 10.0;
        height = 39.0;
        expResult = 12246;
        result = instance.calculateVolume(radius, height);
        assertEquals(expResult, result, 12246);          
        
    }
    
}
