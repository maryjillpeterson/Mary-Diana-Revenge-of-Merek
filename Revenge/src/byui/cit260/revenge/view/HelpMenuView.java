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
public class HelpMenuView {
        
    
    private final String MENU = "\n"
            + "\n------------------------------------------------------"
            + "\n| Help Menu                                          |"
            + "\n------------------------------------------------------"
            + "\nG - Goal of the Game"
            + "\nM - How to move around"
            + "\nE - Exit"
            + "\n------------------------------------------------------";

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

    public void doAction(char choice) {
        
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
                return;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
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
    
