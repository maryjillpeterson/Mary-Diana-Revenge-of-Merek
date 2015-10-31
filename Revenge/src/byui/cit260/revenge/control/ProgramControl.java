/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.control;

import byui.cit260.revenge.model.Player;
import revenge.Revenge;

/**
 *
 * @author Diana
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
        
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        Revenge.setPlayer(player);  // save the player
        
        return player;
    }
    
    
}
