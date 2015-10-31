/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.view;

import byui.cit260.revenge.control.ProgramControl;
import byui.cit260.revenge.model.Player;
import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class StartProgramView {  
    
    public StartProgramView(){
}

    public void startProgram(){

    //Display the banner screen
    this.displayBanner();
    
    //Prompt the player to enter their name and Retrieve the name of the player
    String playersName = this.getPlayersName();
    
    //Create and save the player object
    Player player = ProgramControl.createPlayer(playersName);
    
    //Display a personalized welcome message
    this.displayWelcomeMessage(player);
    
    //Display the Main Menu

}

    public void displayBanner() {
        System.out.println("\n\n********************************************************");
                
        System.out.println("*                                                      *"
                       + "\n*               THE REVENGE OF MEREK                   *"
                       + "\n*                                                      *");
        
        System.out.println("*                                                      *"
                       + "\n* The loving and wise King Merek ruled over the land   *"
                       + "\n* of Afenara.  But the evil Orc Worthag has decided    *"
                       + "\n* it was his turn at the helm and overthrew the king.  *"
                       + "\n* The land of Afenara and its people are now suffering *"
                       + "\n* under the rule of Worthag.                           *");
        
        System.out.println("*                                                      *"
                       + "\n* You seek to gain the throne back for you father.  To *"
                       + "\n* do so, you will need to seek out the support from the*"
                       + "\n* Lords of each of the five counties across the land.  *"
                       + "\n* With their trust and support, you can bolster your   *"
                       + "\n* forces, win back the kingdom from Worthag, and       *"
                       + "\n* reestablish King Merek as the righteous ruler over   *"
                       + "\n* the kingdom again.                                   *");
        
        System.out.println("*                                                      *"
                       + "\n* To gain the trust of the Lords, you will be given    *"
                       + "\n* several quests.  These quests will involve recovering*"
                       + "\n* valuable lost artifacts, helping villages resolve    *"
                       + "\n* problems, battling monsters or warriors, or out      *"
                       + "\n* thinking witches.  Once each of the quests have been *"
                       + "\n* completed in each county, you will have all the      *"
                       + "\n* forces you need to defeat Worthag and win the game!  *");
        
        System.out.println("********************************************************");            
    }

    private String getPlayersName() {
        boolean valid = false; //indicates if the name has to be retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid name has not been retrieved
            
            //prompt for the player's name
            System.out.println("Enter the player's name below:");
            
            //get the name from the keyboard and trim off the blank
            playersName = keyboard.nextLine();
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

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n====================================================");
        System.out.println("\tWelcome to Afenara, " + player.getName());
        System.out.println("\tThe future of the Kingdom is in your hands.");
        System.out.println("====================================================");
    }

   

}