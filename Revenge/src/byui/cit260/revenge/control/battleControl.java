/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.control;

/**
 *
 * @author chadepeterson
 */
public class battleControl {
    public double calculateHealth(double playerStrength, double damage){
    
        if (playerStrength <= 0){
            return -1;
        }
        
        if (playerStrength > 20){
            return -1;
        }
        
        double health = (playerStrength - damage);
        
        return health;

    }
}
    
    