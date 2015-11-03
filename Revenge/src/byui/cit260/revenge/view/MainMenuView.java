/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import byui.cit260.revenge.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author chadepeterson
 */
public class MainMenuView {
    
    private final String MENU = "/n"
            +"/n-----------------------------------------"
            +"/n  Main Menu                              "
            +"/n-----------------------------------------"
            +"/nG - Start Game"
            +"/nH - Get help on how to play the game"
            +"/nC - Continue Game"
            +"/nE - Exit"
            +"/n-----------------------------------------";
    
    public void displayMenu() {
        char selection = ' ';
        do{
            System.out.println(MENU);  //display the Help Menu
            
            String input = this.getInput();  //get the user's selection
            selection = input.charAt(0); //get first character of the string
            
            this.doAction(selection); //do action based on selection
            
        }while (selection != 'E'); //the selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; //indicates if the entry has to be retrieved
        String menuEntry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid entry has not been retrieved
            
            //prompt for the menu entry
            System.out.println("Enter the desired menu topic:");
            
            //get the entry from the keyboard and trim off the blank
            menuEntry = keyboard.nextLine();
            menuEntry = menuEntry.trim();
            
            //if the entry is invalid (less than two characters in length)
            if (menuEntry.length()<1){
                System.out.println("Invalid entry");
                continue; // and repeat again
            }
            break; //out of the (exit) the repetition
        }
        return menuEntry; // return the entry
    }

    private void doAction(char choice) {
        
        switch (choice){
            case 'G': //start a new game
                this.startNewGame();
                break;
            case 'H': //display the help menu
                this.displayHelpMenu();
                break;
            case 'C': //continue game
                this.continueGame();
                break;
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
    }

    private void startNewGame() {
                //create a new game
        GameControl.createNewGame(Revenge.getPlayer());
        
                //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void continueGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
