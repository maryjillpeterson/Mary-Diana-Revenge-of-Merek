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
    Worthag("The evil Orc who has usurped the thron and taken over the kingdom."),
    Sirius("The Lord of the County of Cumuland."),
    Byron("The Lord of County of Keets"),
    Whitman("The Lord of County Walt"),
    Tenor("The Lord of the County TrebleCliff"),
    Otis("The Lord of the County Upton"),
    Bayar("Hero of the County of Cumuland"),
    Maltev("Hero of the County Walt"),
    Kanto("Hero of the County Keets"),
    Altin("Warrior of the County TrebleCliff"),
    Extacrucious("Warrior o the County Upton"),
    Gizellia("An old witch with a riddle.");
    
    //class instance variable
    private final String description;
    private final String location;
    private Point coordinates;//not sure if this is correct

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + ", description=" + description + ", location=" + location + '}';
    }
    
}
