/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import byui.cit260.revenge.control.GameControl;
import java.util.Scanner;
import revenge.Revenge;

/**
 *
 * @author chadepeterson
 */
public class MainMenuView extends View {
    
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
        
        switch (choice){
            case 'S': //start a new game
            case 's':
                this.startNewGame();
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

    private void startNewGame() {
                //create a new game
        GameControl.createNewGame(GameControl.getPlayer());
        
                //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void displayHelpMenu() {
                //display the help menu
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayMenu();
    }

    private void continueGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
