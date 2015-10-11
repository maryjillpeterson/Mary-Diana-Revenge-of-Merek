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
public class Inventory implements Serializable{
    
    private String itemName;
    private String itemDescription;
    private String quantityItem;
    private String itemType;
    private String equipped;

    public Inventory() {
    }
    
    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getQuantityItem() {
        return quantityItem;
    }

    public void setQuantityItem(String quantityItem) {
        this.quantityItem = quantityItem;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
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
        hash = 29 * hash + Objects.hashCode(this.itemName);
        hash = 29 * hash + Objects.hashCode(this.itemDescription);
        hash = 29 * hash + Objects.hashCode(this.quantityItem);
        hash = 29 * hash + Objects.hashCode(this.itemType);
        hash = 29 * hash + Objects.hashCode(this.equipped);
        return hash;
    }

    @Override
    public String toString() {
        return "Inventory{" + "itemName=" + itemName + ", itemDescription=" + itemDescription + ", quantityItem=" + quantityItem + ", itemType=" + itemType + ", equipped=" + equipped + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        if (!Objects.equals(this.quantityItem, other.quantityItem)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.equipped, other.equipped)) {
            return false;
        }
        return true;
    }
    
    
    
}
