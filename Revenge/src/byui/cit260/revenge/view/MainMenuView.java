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
            +"\nH - Get Help on How to Play the Game"
            +"\nE - Exit"
            +"\n-----------------------------------------");
    }
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        Actor actor = null;
        
        switch (choice){
            case 'S': //start a new game
            case 's':
        {
            try {
                this.startNewGame();
            } catch (MapControlException mce) {
                ErrorView.display("MainMenuView", mce.getMessage());
            }
        }
                break;
            case 'C': //continue previous game
            case 'c':
                this.continueGame();
                break;
            case 'H': //display the help menu
            case 'h':
                this.displayHelpMenu();
                break;
            case 'E': //exit the program
            case 'e':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Menu selection *** Try Again ***");
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
         //call function to recall saved game
        // prompt for and get the name of the file to save the game in
        System.out.println("\n\nEnter the file path for file where the game "
        + "was saved.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game 
            GameControl.getSavedGame(filePath);
        
        } catch(Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
        //LoadSavedGameView loadSavedGameView = new LoadSavedGameView();
        //loadSavedGameView.LoadSavedGame();
    }



}
