/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.model;

import java.io.Serializable;

/**
 *
 * @author Diana
 */
public class Game implements Serializable{
    
    //class instance variables
    private double timePlayed;
    
    private Player player;
    private Inventory[] inventory;
    private String[] actor;
    private Map map;
    private Satchel satchel;
    
    

    public Game() {
    }

    public double getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(double timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Satchel getSatchel() {
        return satchel;
    }

    public void setSatchel(Satchel satchel) {
        this.satchel = satchel;
    }

    
    @Override
    public String toString() {
        return "Game{" + "timePlayed=" + timePlayed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.timePlayed) ^ (Double.doubleToLongBits(this.timePlayed) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.timePlayed) != Double.doubleToLongBits(other.timePlayed)) {
            return false;
        }
        return true;
    }


}
