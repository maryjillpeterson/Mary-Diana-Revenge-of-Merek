/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.control;

import byui.cit260.revenge.exceptions.QuestControlException;

/**
 *
 * @author Mary and Diana
 */
public class QuestControl {

    
    public double calculateVolume(double width, double height) throws QuestControlException{
        
        double radius = width / 2;
        
        if (radius <= 12 && radius >= 24){
            throw new QuestControlException("Radius must be between 12 and 24.  Please try again.");
        }
        
        if (height <= 40 && height >= 60){
            throw new QuestControlException("Height must be between 40 and 60.  Please try again.");
        }
        
        double volume = 3.14 * radius * radius * height;
        
        return volume; 
        
} 
}
