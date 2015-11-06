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
public class BattleMenuView {
    
     private final String MENU = "\n"
            + "\n------------------------------------------------------"
            + "\n         Battle Options                               "
            + "\n------------------------------------------------------"
            + "\nS - Strike, P - Pummel, C - Charge,"
            + "\nH - Heal, Q - Quit Battle"
            + "\n"
            + "\nX - Displays explainations of the listed options"
            + "\n------------------------------------------------------";

    public void displayMenu() {
        char selection = ' ';
        do{  
            System.out.println(MENU);  //display the Battle Menu
            
            String input = this.getInput();  //get the user's selection
            selection = input.charAt(0); //get first character of the string
            
            this.doAction(selection); //do action based on selection
            
        }while (selection != 'Q'); //the selection is not "Quit"
    }

    private String getInput() {
        boolean valid = false; //indicates if the entry has to be retrieved
        String menuEntry = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { //while a valid entry has not been retrieved
            
            //prompt for the menu entry
            System.out.println("What would you like to do?");
            
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
            case 'S': //execute a strike attack
            case 's':
                this.attackStrike();
                break;
            case 'P': //execute a pummel attack
            case 'p':
                this.attackPummel();
                break;
            case 'C': //execute a charge attack
            case 'c':
                this.attackCharge();
                break;
            case 'H': //execue heal functions
            case 'h':
                this.battleHeal();
                break;
            case 'X': //display Battle Help options
            case 'x':
                this.displayBattleHelp();
                break;
            case 'Q': //exit the battle
            case 'q':
                return;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
    }
    
     private void displayBattleHelp() {
        System.out.println("\n\n-------------------------------------------------------------------------------------");
                
        System.out.println("\n*                Battle Options                        *");
        
        System.out.println("-------------------------------------------------------------------------------------"
                       + "\n* Strike - Your heroicly strike at your opponent!"
                       + "\n     This attack could cause 2-3 points in damage, if you dont miss."
                       + "\n"
                       + "\n* Pummel - This is a berserker attack!  It can cause up t 8 points in damage,"
                       + "\n     but it uses a lot of your energy and will cost your a couple health points, too."
                       + "\n"
                       + "\n* Charge - You charge your opponent and catch them by surprise!  This will"
                       + "\n     stun your opponent for one turn, but you can only use it once every five turns."
                       + "\n"
                       + "\n* Heal - Drink a healing potion from your supplies.  You must already"
                       + "\n     have the potion in your satchel and you will lose a turn in battle."
                       + "\n"
                       + "\n* Quit Battle - If you select this option your will leave the battle."
                       + "\n     This action will not restore your health to your pre-battle levels,"
                       + "\n     but it will let you run away to fight another day.");
        
        System.out.println("-------------------------------------------------------------------------------------");
    }

    private void attackStrike() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void attackPummel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void attackCharge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void battleHeal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
