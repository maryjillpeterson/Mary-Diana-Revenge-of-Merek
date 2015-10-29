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
public class QuestControl {
    public double calculateVolume(double radius, double height){
       if (radius <= 12 && radius >= 24){
            return -1;
        }
        
        if (height <= 40 && height >= 60){
            return -1;
        }
        
        double volume = 3.14 * radius * radius * height;
        
        return volume; 
        
} 
}
