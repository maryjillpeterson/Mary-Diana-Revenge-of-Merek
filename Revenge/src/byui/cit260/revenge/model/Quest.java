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
public class Quest implements Serializable{
    
    private String questName;
    private String questType;
    private String questCounty;
    private String available;
    private String complete;

    public Quest() {
    }
    
    

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public String getQuestType() {
        return questType;
    }

    public void setQuestType(String questType) {
        this.questType = questType;
    }

    public String getQuestCounty() {
        return questCounty;
    }

    public void setQuestCounty(String questCounty) {
        this.questCounty = questCounty;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.questName);
        hash = 19 * hash + Objects.hashCode(this.questType);
        hash = 19 * hash + Objects.hashCode(this.questCounty);
        hash = 19 * hash + Objects.hashCode(this.available);
        hash = 19 * hash + Objects.hashCode(this.complete);
        return hash;
    }

    @Override
    public String toString() {
        return "Quest{" + "questName=" + questName + ", questType=" + questType + ", questCounty=" + questCounty + ", available=" + available + ", complete=" + complete + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Quest other = (Quest) obj;
        if (!Objects.equals(this.questName, other.questName)) {
            return false;
        }
        if (!Objects.equals(this.questType, other.questType)) {
            return false;
        }
        if (!Objects.equals(this.questCounty, other.questCounty)) {
            return false;
        }
        if (!Objects.equals(this.available, other.available)) {
            return false;
        }
        if (!Objects.equals(this.complete, other.complete)) {
            return false;
        }
        return true;
    }
    
    
    
}
