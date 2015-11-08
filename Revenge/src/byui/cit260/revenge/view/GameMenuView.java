/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import java.util.Scanner;

/**
 *
 * @author maryjillpeterson
 */
public class GameMenuView {
    
    private final String MENU = "/n"
            +"/n-----------------------------------------"
            +"/n  Game Play Menu                              "
            +"/n-----------------------------------------"
            +"/nI - Inventory"
            +"/nQ - Quests"
            +"/nM - Move"
            +"/nS - Save"
            +"/nH - Help"
            +"/nE - Exit"
            +"/n-----------------------------------------";
    
    
    public void displayMenu(){
        char selection = ' ';
        do{
            System.out.println(MENU);  //display the Game Play Menu
            
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
            case 'I': //show inventory
                this.inventory();
                break;
            case 'Q': //display the quests
                this.quests();
                break;
            case 'M': //make a move
                this.move();
                break;
            case 'S': //save game
                this.save();
                break;
            case 'H': //Help menu
                this.help();
                break;
            case 'E': //exit game to main
                return;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
    }

    private void inventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void quests() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void help() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

