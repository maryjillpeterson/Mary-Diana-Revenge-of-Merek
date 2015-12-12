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
public class QuestScene implements Serializable{
    
    //class instance variables
    private String questType;

    public QuestScene() {
    }

    public String getQuestType() {
        return questType;
    }

    public void setQuestType(String questType) {
        this.questType = questType;
    }


    @Override
    public String toString() {
        return "QuestScene{" + "questType=" + questType + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.questType);
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
        final QuestScene other = (QuestScene) obj;
        if (!Objects.equals(this.questType, other.questType)) {
            return false;
        }
        return true;
    }


    
    
}
