/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import byui.cit260.revenge.control.GameControl;
import byui.cit260.revenge.model.Actor;
import byui.cit260.revenge.model.Game;
import byui.cit260.revenge.model.Inventory;
import byui.cit260.revenge.model.Location;
import byui.cit260.revenge.model.Map;
import byui.cit260.revenge.model.Quest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import revenge.Revenge;

/**
 *
 * @author mary and diana
 */
public class GameMenuView extends View {

    
    public GameMenuView(){
        super("\n-----------------------------------------"
            +"\n  Game Play Menu "
            +"\n-----------------------------------------"
            +"\nI - Inventory"
            +"\nQ - Quests"
            +"\nM - Move"
            +"\nS - Save"
            +"\nH - Help"
            +"\nV - Map"
            +"\nP - Print Report"    
            +"\nE - Exit"
            +"\n-----------------------------------------");
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
            case 'P': //Print Actor Report
                this.printActorReport();
            case 'E': //exit game to main
                return true;
            default:
                this.console.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
        return false;
    }

    private void viewInventory() {
        //get sorted list of inventory items for the current game
        Inventory[] inventory = GameControl.getSortedInventoryList();
        
        this.console.println("\nList of Inventory Items");
        this.console.println("Description" + "\t" + "On Hand");
        
        //for each inventory item
        for (Inventory inventoryItem : inventory) {
            this.console.println(inventoryItem.getItemDescription() +"\t     " +
                                inventoryItem.getQuantityItem());
        }
    }

    private void viewQuests() {
            //get sorted list of available quests.
        Quest[] quest = GameControl.getSortedQuestList();
        
        this.console.println("\nList of Quests that are Available");
        this.console.println("Description" + "\t" + "On Hand");
        
        //for each quest
        for(Quest questItem : quest) {
            this.console.println(questItem.getQuestName() + "\t        " +
                        questItem.getQuestType() + "\t     " + 
                        questItem.getQuestCounty() + "\t      " +
                        questItem.isAvailable() + "\t       " +
                        questItem.isComplete() + "\t       "
            );
        }
    }

    private void move() {
        MoveActorView moveActorView = new MoveActorView();
        moveActorView.display();
    }

    private void saveGame() {
        //prompt for and get the name of the file to save the game in 
        System.out.println("\n\nEnter the file path for file where the game is to be saved.");
        String filePath = this.getInput();
        
        try {
        //save the game to the specified file
        GameControl.saveGame(Revenge.getCurrentGame(),filePath);
        
        this.console.println("Your game has been successfully saved");
        
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
        System.out.println("this is for the map function");
    }
        //Game locations = Revenge.getCurrentGame();
        
   
        //System.out.println("\n\n====================================================");
        //System.out.println("\t MAP OF AFENARA");
        //System.out.println("====================================================");
        //System.out.println("1" + "\t" + "2" + "\t" + "3" + "\t" + "4" + "\t" + "5" + "\t" + "6" 
        //                    + "\t" + "7" + "\t" + "8" + "\t" + "9" + "\t" + "10");
                
        //for(Game locations : locations) {
          //  System.out.println(locationColumn.getColumn());
           // for (int i = 0; i < location.length; i++) { 
            //    for (int j = 0; j < location[i].length; j++) { 
            //        location[i][j] = i + j;
             //   }
            //}
                
            //for (int[] a : location) { for (int i : a) { 
            //    System.out.print(i + "\t");
            //    System.out.println("\n"); 
           // }

       // }
        
   // }
        
    private void printActorReport(Actor[] actor, String outputLocation) {
        
        this.console.println("\nEnter the file path where the report is to be stored.");
        String filePath = this.getInput();
        
        try (PrintWriter out = new PrintWriter(outputLocation)){
            
            //print title and column headings 
            out.println("\n\n        Actor Report       ");
            out.printf("%n%-20s%10s%10s", "Actor", "Description", "Coordinate");
            out.printf("%n%-20s%10s%10s", "-----------------", "----------------", "-----------------");
            
            //print the description, and coordinate of each actor.
            for(Actor actors : actor) {
                out.printf("%n%-20s%7d", actors.getDescription()
                                       , actors.getCoordinates());
                }
        } catch (IOException ex){
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }

    private void printActorReport() {
        System.out.println("This is created to resolve error.  Need to determine what "
                                + "part of printActorReport() is causing error.");
    }

}
