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
public class lordScene implements Serializable{
    
    private String description;
    private String county;

    public lordScene() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.county);
        return hash;
    }

    @Override
    public String toString() {
        return "lordScene{" + "description=" + description + ", county=" + county + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final lordScene other = (lordScene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.county, other.county)) {
            return false;
        }
        return true;
    }
    
    
    
}
