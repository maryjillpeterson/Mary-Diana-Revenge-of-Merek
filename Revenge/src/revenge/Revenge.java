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
import byui.cit260.revenge.view.HelpMenuView;
import byui.cit260.revenge.view.StartProgramView;

/**
 *
 * @author marypeterson
 */
public class Revenge {

    private static Game currentGame = null;
    private static Player player = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayMenu();
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Revenge.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Revenge.player = player;
    }
    
    
}
