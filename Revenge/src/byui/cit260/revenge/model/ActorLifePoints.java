/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author chadepeterson
 */
public enum ActorLifePoints implements Serializable{
    
    //Name and strength of each actor
    Bandit("40"),
    Extacrucious("40"),
    Gizellia("40");
    
    private String ActorLifePoints;
    
    ActorLifePoints(String ActorLifePoints) {
        this.ActorLifePoints = ActorLifePoints;
    }
    public String getActorLifePoints() {
        return ActorLifePoints;
    }

}



