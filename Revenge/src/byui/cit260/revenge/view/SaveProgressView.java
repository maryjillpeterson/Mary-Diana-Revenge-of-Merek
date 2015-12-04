/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import java.util.Scanner;

/**
 *
 * @author chadepeterson
 */
public class SaveProgressView {
        public SaveProgressView(){
}

    public void saveProgress(){

    //Ask if the player wants to save the game
    String playersName = this.getSaveChoice();
    
}
    private String getSaveChoice() {
        boolean valid = false; //indicates if the name has to be retrieved
        String saveChoice  = null;
        //Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt to see if the player wants to save their game.
            System.out.println("Do you want to save your game? Type yes or no");
            
            //get the name from the keyboard and trim off the blank
            saveChoice = keyboard.readLine();
            saveChoice = saveChoice.trim();
            
            //if he name is invalid (something other than 1 or 2)
            if (saveChoice.length() > 3) {
                System.out.println("Invalid entry - the entry must be either 1 for Yes or 2 for No");
                continue; // and repeat again
            }
            break; //out of the (exit) the repetition
        }
        return saveChoice; // return the name
    }                                                    
}
