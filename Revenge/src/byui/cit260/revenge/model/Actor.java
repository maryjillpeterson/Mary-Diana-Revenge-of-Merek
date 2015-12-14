/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Diana
 */
public enum Actor implements Serializable{
    
    //names and descriptions of characters
    Bandit("The thief of artifacts."),
    Extacrucious("The Warrior who will battle the player."),
    Gizellia("An old witch");
    
    //class instance variable
    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    
    
    
    
}
