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
    Merek("The rightful and just kind of Afenara."),
    Worthag("The evil Orc who has usurped the throne and taken over the kingdom."),
    Sirius("The Lord of the County of Cumuland"),
    Byron("Villager trying to build a barrel."),
    Whitman("Village trying to ship a barrel of fish oil."),
    Tenor("Villager waiting to receive a shipment."),
    Otis("The Lord of the County Upton"),
    Extacrucious("Warrior of the County Upton"),
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
