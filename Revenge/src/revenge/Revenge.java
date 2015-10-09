/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revenge;

import byui.cit260.revenge.model.Player;

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
    }
    
}
