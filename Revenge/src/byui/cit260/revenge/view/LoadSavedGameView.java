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
public class LoadSavedGameView {
    public LoadSavedGameView(){
    }        
        public void LoadSavedGame() {
            //display the loading saved game instructions
            this.loadInstructions();
            //Prompt the player to enter their name and Retrieve the name of the player associated with the saved game
            String playersName = this.getPlayersName();
    }
        
        public void loadInstructions(){
            System.out.println("\n\n********************************************************");
            System.out.println("*                                                      *"
                + "\n*   CONTINUE YOUR QUEST. LOAD YOUR SAVED GAME HERE.    *"
                + "\n*                                                      *");
        }
        
        private String getPlayersName() {
        boolean valid = false; //indicates if the name has to be retrieved
        String playersName = null;
        //Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the player's name
            System.out.println("Enter the player's name associated with your saved game below:");
            
            //get the name from the keyboard and trim off the blank
            playersName = keyboard.readLine();
            playersName = playersName.trim();
            
            //if he name is invalid (less than two characters in length)
            if (playersName.length()<2){
                System.out.println("Invalid name - the name must not be blank");
                continue; // and repeat again
            }
            break; //out of the (exit) the repetition
        }
        return playersName; // return the name
    }
}
