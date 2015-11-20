/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author chadepeterson
 */
public class Inventory implements Serializable{   /// how do we change this to an array??
    
    
    public enum Item { ////  I'm not sure if this is the right place for this.
        potion,
        bandage,
        artifact;
    }
    
    //class instance variables
    private String itemDescription;
    private int quantityItem;
    private String equipped;

    public Inventory() {
    }
    
   
    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getQuantityItem() {
        return quantityItem;
    }

    public void setQuantityItem(int quantityItem) {
        this.quantityItem = quantityItem;
    }

    public String getEquipped() {
        return equipped;
    }

    public void setEquipped(String equipped) {
        this.equipped = equipped;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.itemDescription);
        hash = 29 * hash + Objects.hashCode(this.quantityItem);
        hash = 29 * hash + Objects.hashCode(this.equipped);
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + ", itemDescription=" + itemDescription + ", quantityItem=" + quantityItem + ", equipped=" + equipped + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        if (!Objects.equals(this.quantityItem, other.quantityItem)) {
            return false;
        }
        if (!Objects.equals(this.equipped, other.equipped)) {
            return false;
        }
        return true;
    }
    
    
    
}
