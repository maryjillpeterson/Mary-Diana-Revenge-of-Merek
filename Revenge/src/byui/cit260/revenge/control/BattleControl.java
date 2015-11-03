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
public class BattleControl {
    private int turnNumber;
    private int lastCharge;

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
    
    public boolean validCharge(int turnNumber, int lastCharge){
    
        if(turnNumber == 0){
            return false;
        }
        
        boolean validCharge = ((turnNumber - lastCharge)>= 5) || (lastCharge == 0);
        
        return validCharge;
    }
}

