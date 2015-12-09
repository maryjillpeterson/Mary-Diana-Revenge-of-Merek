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
 * @author Diana
 */
public class RegularScene implements Serializable{
    
    //class instance variables
    private String description;
    private String mapSymbol;
    private Boolean blocked;

    public RegularScene() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RegularScene{" + "description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
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
        final RegularScene other = (RegularScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    public void setMapSymbol(String _st_) {
        this.mapSymbol = mapSymbol;
    }

    public void setBlocked(boolean b) {
        this.blocked = blocked;
    }
    
}
