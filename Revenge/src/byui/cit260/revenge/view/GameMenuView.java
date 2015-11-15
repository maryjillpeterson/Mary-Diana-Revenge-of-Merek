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
public class GameMenuView extends View {

    
    public GameMenuView(){
        super("/n-----------------------------------------"
            +"/n  Game Play Menu                              "
            +"/n-----------------------------------------"
            +"/nI - Inventory"
            +"/nQ - Quests"
            +"/nM - Move"
            +"/nS - Save"
            +"/nH - Help"
            +"/nE - Exit"
            +"/n-----------------------------------------");
    }
   
    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
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
                return true;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
        return false;
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

