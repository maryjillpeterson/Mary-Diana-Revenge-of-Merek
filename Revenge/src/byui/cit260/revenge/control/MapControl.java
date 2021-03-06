/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.control;

import byui.cit260.revenge.exceptions.MapControlException;
import byui.cit260.revenge.model.Actor;
import byui.cit260.revenge.model.Game;
import byui.cit260.revenge.model.Location;
import byui.cit260.revenge.model.Map;
import byui.cit260.revenge.model.Player;
import byui.cit260.revenge.model.Q;
import byui.cit260.revenge.model.Quest;
import byui.cit260.revenge.model.QuestScene;
import byui.cit260.revenge.model.RegularScene;
import byui.cit260.revenge.model.SceneType;
import java.awt.Point;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import revenge.Revenge;


/**
 *
 * @author chadepeterson and Diana
 */
public class MapControl {
    private static String filepath;
    private static OutputStream fops;

    static Map createMap() {
        //create the map
        Map map = new Map(8,10);
        
        //create a list of the different scenes in the game
        RegularScene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
     }

    public static void moveActorsToStartingLocation(Map map) 
                            throws MapControlException {
        Actor[] actors = Actor.values();
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
            
        }
    }
    
    public static void moveActorToLocation(Actor actor, Point coordinates)
                        throws MapControlException {
        
    //moves actor to new location
        Map map = Revenge.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        //determines if new locations is within the boundaries of the map. If no, an error message is returned.
        if(newRow < 0 || newRow >= map.getRowCount() ||
           newColumn < 0 || newColumn >= map.getColumnCount()) {
           throw new MapControlException("Can not move actor to location"
                   + coordinates.x + ", " + coordinates.y
                   + "because that location is outside "
                   + "the bounds of the map.");
        }
    }

    private static RegularScene[] createScenes() {
        Game game = Revenge.getCurrentGame();
        
        RegularScene[] scenes = new RegularScene[SceneType.values().length];
        
        RegularScene startingScene = new RegularScene();
        startingScene.setDescription(
                "\n Welcome to the great land of Afenara.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        RegularScene forestScene = new RegularScene();
        forestScene.setDescription(
                "\n You are in a ancient and dark forest."
               +"\n These woods look dangerous.");
        forestScene.setMapSymbol("####");
        forestScene.setBlocked(false);
        scenes[SceneType.forest.ordinal()] = forestScene;
        
        RegularScene mountainScene = new RegularScene();
        mountainScene.setDescription(
                "\n The land has become rugged.  In the distance you see a large mountian range.");
        mountainScene.setMapSymbol("^^^^");
        mountainScene.setBlocked(false);
        scenes[SceneType.mountain.ordinal()] = mountainScene;
        
        /*RegularScene lordScene = new RegularScene();
        lordScene.setDescription(
                "\n You have come to the house of the Lord of the County.");
        lordScene.setMapSymbol(" L ");
        lordScene.setBlocked(false);
        scenes[SceneType.lord.ordinal()] = lordScene;*/
        
        RegularScene battleScene = new RegularScene();
        battleScene.setDescription(
                "\n You have entered an area. This must be where the jousts and fights are held.");
        battleScene.setMapSymbol(" A ");
        battleScene.setBlocked(false);
        scenes[SceneType.battle.ordinal()] = battleScene;
        
        RegularScene villageScene = new RegularScene();
        villageScene.setDescription(
                "\n You have entered a village.");
        villageScene.setMapSymbol(" V ");
        villageScene.setBlocked(false);
        scenes[SceneType.village.ordinal()] = villageScene;
        
        RegularScene bogScene = new RegularScene();
        bogScene.setDescription(
                "\n You are travelling through a bog.  Th ground is soft and there "
                +"\nare swamps all around.  The air is think an foggy.");
        bogScene.setMapSymbol(" ,, ");
        bogScene.setBlocked(false);
        scenes[SceneType.bog.ordinal()] = bogScene;
        
        RegularScene fieldScene = new RegularScene();
        fieldScene.setDescription(
                "\n You are travling through fields and farms.");
        fieldScene.setMapSymbol(" ;; ");
        fieldScene.setBlocked(false);
        scenes[SceneType.field.ordinal()] = fieldScene;
        
        RegularScene shoreScene = new RegularScene();
        shoreScene.setDescription(
                "\n You are travling through fields and farms."
               +"\n You see a large Lake in the distance."
               +"\n At the edge of the lake, there a boat dock with a small row boat.");
        shoreScene.setMapSymbol(" -~ ");
        shoreScene.setBlocked(false);
        scenes[SceneType.shore.ordinal()] = shoreScene;
        
        RegularScene riverScene = new RegularScene();
        riverScene.setDescription(
                "\n You are travling through fields and farms."
               +"\n There is a large river here.");
        riverScene.setMapSymbol(" |~| ");
        riverScene.setBlocked(false);
        scenes[SceneType.river.ordinal()] = riverScene;
        
        RegularScene finishScene = new RegularScene();
        finishScene.setDescription(
                "\n This will be our end.");
        finishScene.setMapSymbol(" FN ");
        scenes[SceneType.finish.ordinal()] = finishScene;
        return scenes;
    }

    private static void assignScenesToLocations(Map map, RegularScene[] scenes) {
        Location[] [] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][6].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][7].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][8].setScene(scenes[SceneType.forest.ordinal()]);
        locations[0][9].setScene(scenes[SceneType.shore.ordinal()]);
        
        locations[1][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.field.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.field.ordinal()]);
        locations[1][5].setScene(scenes[SceneType.forest.ordinal()]);
        locations[1][6].setScene(scenes[SceneType.bog.ordinal()]);
        locations[1][7].setScene(scenes[SceneType.bog.ordinal()]);
        locations[1][8].setScene(scenes[SceneType.bog.ordinal()]);
        locations[1][9].setScene(scenes[SceneType.shore.ordinal()]);
        
        locations[2][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.field.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.field.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.field.ordinal()]);
        locations[2][5].setScene(scenes[SceneType.field.ordinal()]);
        locations[2][6].setScene(scenes[SceneType.bog.ordinal()]);
        locations[2][7].setScene(scenes[SceneType.bog.ordinal()]);
        locations[2][8].setScene(scenes[SceneType.bog.ordinal()]);
        locations[2][9].setScene(scenes[SceneType.shore.ordinal()]);
        
        locations[3][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.forest.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.field.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.field.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.start.ordinal()]);
        locations[3][5].setScene(scenes[SceneType.finish.ordinal()]);
        locations[3][6].setScene(scenes[SceneType.field.ordinal()]);
        locations[3][7].setScene(scenes[SceneType.field.ordinal()]);
        locations[3][8].setScene(scenes[SceneType.field.ordinal()]);
        locations[3][9].setScene(scenes[SceneType.shore.ordinal()]);
        
        locations[4][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.village.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.village.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.field.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.battle.ordinal()]);
        locations[4][5].setScene(scenes[SceneType.field.ordinal()]);
        locations[4][6].setScene(scenes[SceneType.field.ordinal()]);
        locations[4][7].setScene(scenes[SceneType.field.ordinal()]);
        locations[4][8].setScene(scenes[SceneType.village.ordinal()]);
        locations[4][9].setScene(scenes[SceneType.shore.ordinal()]);
        
        locations[5][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[5][1].setScene(scenes[SceneType.village.ordinal()]);
        locations[5][2].setScene(scenes[SceneType.village.ordinal()]);
        locations[5][3].setScene(scenes[SceneType.field.ordinal()]);
        locations[5][4].setScene(scenes[SceneType.field.ordinal()]);
        locations[5][5].setScene(scenes[SceneType.field.ordinal()]);
        locations[5][6].setScene(scenes[SceneType.field.ordinal()]);
        locations[5][7].setScene(scenes[SceneType.village.ordinal()]);
        locations[5][8].setScene(scenes[SceneType.village.ordinal()]);
        locations[5][9].setScene(scenes[SceneType.shore.ordinal()]);
        
        locations[6][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[6][1].setScene(scenes[SceneType.village.ordinal()]);
        locations[6][2].setScene(scenes[SceneType.village.ordinal()]);
        locations[6][3].setScene(scenes[SceneType.field.ordinal()]);
        locations[6][4].setScene(scenes[SceneType.field.ordinal()]);
        locations[6][5].setScene(scenes[SceneType.field.ordinal()]);
        locations[6][6].setScene(scenes[SceneType.field.ordinal()]);
        locations[6][7].setScene(scenes[SceneType.village.ordinal()]);
        locations[6][8].setScene(scenes[SceneType.village.ordinal()]);
        locations[6][9].setScene(scenes[SceneType.shore.ordinal()]);
        
        locations[7][0].setScene(scenes[SceneType.mountain.ordinal()]);
        locations[7][1].setScene(scenes[SceneType.river.ordinal()]);
        locations[7][2].setScene(scenes[SceneType.river.ordinal()]);
        locations[7][3].setScene(scenes[SceneType.river.ordinal()]);
        locations[7][4].setScene(scenes[SceneType.river.ordinal()]);
        locations[7][5].setScene(scenes[SceneType.river.ordinal()]);
        locations[7][6].setScene(scenes[SceneType.river.ordinal()]);
        locations[7][7].setScene(scenes[SceneType.river.ordinal()]);
        locations[7][8].setScene(scenes[SceneType.river.ordinal()]);
        locations[7][9].setScene(scenes[SceneType.shore.ordinal()]);
    }

    private static void assignQuestsToLocations(Map map, Quest[] quest) {
        Location[] [] locations = map.getLocations();
        
        //start point
        locations[1][1].setQuest(quest[Q.artifact.ordinal()]);
        locations[5][1].setQuest(quest[Q.container.ordinal()]);
        locations[1][7].setQuest(quest[Q.riddle.ordinal()]);
        locations[4][4].setQuest(quest[Q.strength.ordinal()]);
        locations[5][8].setQuest(quest[Q.shipment.ordinal()]);
    }
    
    public static void printMap(Map map, String filepath) throws MapControlException, IOException {
        
        try(FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(map);  //write the map object out to the file
        }
        catch (IOException e) {
                throw new MapControlException(e.getMessage());
                }
        }
    
    public static void movePlayerToLocation(Player player, Point coordinates)
                        throws MapControlException {
        
    //moves actor to new location
        Map map = Revenge.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        //determines if new locations is within the boundaries of the map. If no, an error message is returned.
        if(newRow < 0 || newRow >= map.getRowCount() ||
           newColumn < 0 || newColumn >= map.getColumnCount()) {
           throw new MapControlException("Can not move actor to location"
                   + coordinates.x + ", " + coordinates.y
                   + "because that location is outside "
                   + "the bounds of the map.");
        }
    }

    }


