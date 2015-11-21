/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.control;

import byui.cit260.revenge.model.Game;
import byui.cit260.revenge.model.Location;
import byui.cit260.revenge.model.Map;
import byui.cit260.revenge.model.RegularScene;
import byui.cit260.revenge.model.SceneType;
import com.sun.j3d.loaders.Scene;
import revenge.Revenge;


/**
 *
 * @author chadepeterson
 */
public class MapControl {

    private static Map createMap() {
        //create the map
        Map map = new Map(20,20);
        
        //create a list of the differnt scenes in the game
        Scene[] scenes = createScenes();
        
        //assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
     }

    static void moveActorsToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static RegularScene[] createScenes() {
        Game game = Revenge.getCurrentGame();
        
        RegularScene[] scenes = new RegularScene[SceneType.values().length];
        
        RegularScene startingScene = new RegularScene() {};
        startingScene.setDescription(
                "\n This will be our start.");
        startingScene.setMapSymbol(" ST ");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        RegularScene finishScene = new RegularScene();
        finishScene.setDescription(
                "\n This will be our end.");
        finishScene.setMapSymbol(" FN ");
        scenes[SceneType.finish.ordinal()] = finishScene;
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[] [] locations = map.getLocations();
        
        //start point
        locations[0][0].setRegularScene(scenes[SceneType.start.ordinal()]);
        locations[0][1].setRegularScene(scenes[SceneType.finish.ordinal()]);
        locations[0][2].setRegularScene(scenes[SceneType.lord.ordinal()]);
        locations[0][3].setRegularScene(scenes[SceneType.quest.ordinal()]);
        locations[0][4].setRegularScene(scenes[SceneType.village.ordinal()]);
    }
    
}
