/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.view;

import java.util.Scanner;

/**
 *
 * @author Diana
 */
public class HelpMenuView extends View {
        
    public HelpMenuView(){
      super("\n------------------------------------------------------"
            + "\n| Help Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nG - Goal of the Game"
            + "\nM - How to move around"
            + "\nE - Exit"
            + "\n------------------------------------------------------");
    }

    
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'G': //display goal of the game
            case 'g':
                this.displayGoal();
                break;
            case 'M': //display how to move around
            case 'm':
                this.displayMove();
                break;
            case 'E': //exit the help menu
            case 'e':
                return true;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
        return false;
    }

    private void displayGoal() {
        System.out.println("\n\n********************************************************");
                
        System.out.println("*                                                      *"
                       + "\n*               Goal of the Game                       *"
                       + "\n*                                                      *");
        
        System.out.println("*                                                      *"
                       + "\n* In this game, you are the son of the overthrown king,*"
                       + "\n* King Merek.  You seek to gain the throne back for    *" 
                       + "\n* your father.  To do this, you will need to seek out  *"
                       + "\n* support from five Lords throughout the land.         *"
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

    private void displayMove() {
        System.out.println("\n\n********************************************************");
                
        System.out.println("*                                                      *"
                       + "\n*            Moving Around the Game                    *"
                       + "\n*                                                      *");
        
        System.out.println("*                                                      *"
                       + "\n* To move from scene to scene, enter the following"
                       + "\n* commands: "
                       + "\n* N - North"
                       + "\n* E - East"
                       + "\n* S - South"
                       + "\n* W - West");
        
        System.out.println("********************************************************");
    }

    
}
    