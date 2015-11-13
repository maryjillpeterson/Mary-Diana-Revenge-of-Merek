/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import static java.awt.SystemColor.MENU;
import java.util.Scanner;

/**
 *
 * @author chadepeterson
 */
public abstract class View implements ViewInterface {
    Scanner keyboard = new Scanner(System.in);
    protected String displayMessage;
    
    public View(String message){
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        do{
            System.out.println(MENU);  //display the Help Menu
            
            value = this.getInput();  //get the user's selection
            done = this.doAction(value); //do action based on selection
            
        }while (!done); //the selection is not "Exit"
    }
    @Override
    public String getInput() {
        boolean valid = false; //indicates if the entry has to be retrieved
        String selection = null;
        
        while(!valid) { //while a valid entry has not been retrieved
                        
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            //if the entry is invalid (less than two characters in length)
            if (selection.length()<1){
                System.out.println("Invalid entry");
                continue; // and repeat again
            }
            break; //out of the (exit) the repetition
        }
        return selection; // return the entry
    }
}
