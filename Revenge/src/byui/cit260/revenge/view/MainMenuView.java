/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import byui.cit260.revenge.control.GameControl;
import byui.cit260.revenge.control.MapControl;
import byui.cit260.revenge.exceptions.MapControlException;
import byui.cit260.revenge.model.Actor;
import java.awt.Point;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import revenge.Revenge;

/**
 *
 * @author mary
 */
public class MainMenuView extends View {
    private Point coordinates;
    
    public MainMenuView(){
        super("\n"
            +"\n-----------------------------------------"
            +"\n  Main Menu                              "
            +"\n-----------------------------------------"
            +"\nS - Start New Game"
            +"\nC - Continue Existing Game"
            +"\nH - Get Help on how to play the game"
            +"\nE - Exit"
            +"\n-----------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        Actor actor = null;
        
        try{
        MapControl.moveActorToLocation(actor, coordinates);
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
        
        switch (choice){
            case 'S': //start a new game
            case 's':
        try {
            this.startNewGame();
        } catch (MapControlException ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
                break;
            case 'H': //display the help menu
            case 'h':
                this.displayHelpMenu();
                break;
            case 'C': //continue previous game
            case 'c':
                this.continueGame();
                break;
            case 'E': //exit the program
            case 'e':
                return true;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
                
        }
        return false;
    }
    

    private void startNewGame() throws MapControlException {
                //create a new game
        GameControl.createNewGame(GameControl.getPlayer());
        
                //display the game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    private void displayHelpMenu() {
                //display the help menu
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void continueGame() {
                //call function to recall savd game
        LoadSavedGameView loadSavedGameView = new LoadSavedGameView();
        loadSavedGameView.LoadSavedGame();
    }
}
