/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revenge;

import byui.cit260.revenge.model.Actor;
import byui.cit260.revenge.model.Game;
import byui.cit260.revenge.model.Map;
import byui.cit260.revenge.model.Player;
import byui.cit260.revenge.model.QuestScene;
import byui.cit260.revenge.model.RegularScene;
import byui.cit260.revenge.model.Satchel;

/**
 *
 * @author marypeterson
 */
public class Revenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Merek");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Map mapOne = new Map();
        
        mapOne.setRowCount(5);
        mapOne.setColumnCount(7);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Actor actorOne = new Actor();
        
        actorOne.setName("Merek");
        actorOne.setDescription("main character");
        actorOne.setLocation("1A");
        
        String actorInfo = actorOne.toString();
        System.out.println(actorOne);
        
        RegularScene sceneOne = new RegularScene();
        
        sceneOne.setDescription("A Crossroads. "
                + "A sign post displays: "
                + "Navarra - North, "
                + "Sumpter - West, "
                + "Eliasia - South, "
                + "Durmst - East");
        
        String regularSceneInfo = sceneOne.toString();
        System.out.println(sceneOne);
        
        QuestScene sceneTwo = new QuestScene();
        
        sceneTwo.setDescription("Wise Woman - You see an old woman sitting under a tree.");
        sceneTwo.setQuestType("Riddle");
        sceneTwo.setBlocked("Y");
        
        String questSceneInfo = sceneTwo.toString();
        System.out.println(sceneTwo);
        
        Game timeOne = new Game();
        
        timeOne.setTimePlayed(18.53);
        
        String timeInfo = timeOne.toString();
        System.out.println(timeOne);
        
        Satchel itemOne = new Satchel();
        
        itemOne.setDescription("Healing Potion");
        itemOne.setMaxCapacity(5);
        
        String satchelInfo = itemOne.toString();
        System.out.println(itemOne);
        
    }
    
}
