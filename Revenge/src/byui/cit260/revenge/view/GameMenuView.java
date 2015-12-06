/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import byui.cit260.revenge.control.GameControl;
import byui.cit260.revenge.model.Game;
import byui.cit260.revenge.model.Inventory;
import byui.cit260.revenge.model.Location;
import java.util.Scanner;
import revenge.Revenge;

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
            +"/nV - Map"
            +"/nP - Print Report"    
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
                this.viewInventory();
                break;
            case 'Q': //display the quests
                this.viewQuests();
                break;
            case 'M': //make a move
                this.move();
                break;
            case 'V': //open map
                this.displayMap();
                break;
            case 'S': //save game
                this.saveGame();
                break;
            case 'H': //Help menu
                this.viewHelpMenu();
                break;
            case 'P': //Print Report
                this.printReport();
            case 'E': //exit game to main
                return true;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
        return false;
    }

    private void viewInventory() {
        //get sorted list of inventory items for the current game
        Inventory[] inventory = GameControl.getSortedInventoryList();
        
        System.out.println("\nList of Inventory Items");
        System.out.println("Description" + "\t" +
                                "Required" + "\t" +
                                "In Stock");
        
        //for each inventory item
        for (Inventory inventoryItem : inventory) {
            System.out.println(inventoryItem.getDescription() +"\t     " +
                                inventoryItem.getRequiredAmount() + "\t      " +
                                inventoryItem.getQuantityInStock());
        }
    }

    private void viewQuests() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in 
        System.out.println("\n\nEnter the file path for file where the game "
        + "is to be saved.");
        String filePath = this.getInput();
        
        try {
        //save the game to the specified file
        GameControl.saveGame(Revenge.getCurrentGame(),filePath);
        } catch (Exception ex){
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }

    private void viewHelpMenu() {
               //display the help menu
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void displayMap() {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
       // Location[] [] locations = Revenge.getLocations();
        
   
        //System.out.println("\n\n====================================================");
        //System.out.println("\t MAP OF AFENARA");
        //System.out.println("====================================================");
        //System.out.println("Column" + "\t" +
                
        //for(Location locationColumn : locations) {
            //System.out.println(locationColumn.getColumn());
          //  for (int i = 0; i < location.length; i++) { 
            //    for (int j = 0; j < location[i].length; j++) { 
              //      location[i][j] = i + j;
              //  }
          //  }
                
           // for (int[] a : location) { for (int i : a) { 
           //     System.out.print(i + "\t");
           //     System.out.println("\n"); 
          //  }

      //  }
        
   // }

    private void printReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

