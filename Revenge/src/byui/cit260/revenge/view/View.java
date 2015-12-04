/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import static java.awt.SystemColor.MENU;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import revenge.Revenge;

/**
 *
 * @author chadepeterson
 */
public abstract class View implements ViewInterface {
    //Scanner keyboard = new Scanner(System.in);
    private String displayMessage;
    
    protected final BufferedReader keyboard = Revenge.getInFile();
    protected final PrintWriter console = Revenge.getOutFile();

    public View(String displayMessage){
        this.displayMessage = displayMessage;
    }
    
    @Override
    public void display() {
        String value = "";
        boolean done = false;
        do{
            this.console.println(this.displayMessage);  //display message
            
            value = this.getInput();  //get the user's selection
            done = this.doAction(value); //do action based on selection
            
        }while (!done); //the selection is not "Exit"
    }
    @Override
    public String getInput() {
        boolean valid = false; //indicates if the entry has to be retrieved
        String selection = null;
        //Scanner keyboard = new Scanner(System.in); //keyboard input stream
        
        while(!valid) { try {
            //while a valid entry has not been retrieved
            
            //get value entered from the keyboard
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
            //if the entry is invalid (less than one character in length)
            if (selection.length()<1){
                ErrorView.display(this.getClass().getName(),
                        "Invalid entry");
                continue; // and repeat again
            }
            break; //out of the (exit) the repetition
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(),
                        "Error reading input: " + e.getMessage());
                return null;
            }
        }
        return selection; // return the entry
    }
    
    public String getDisplayMessage() {
        return displayMessage;
    }

    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }
}
