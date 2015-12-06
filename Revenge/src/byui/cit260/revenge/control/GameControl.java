

package byui.cit260.revenge.control;

import byui.cit260.revenge.exceptions.GameControlException;
import byui.cit260.revenge.exceptions.MapControlException;
import byui.cit260.revenge.model.Game;
import byui.cit260.revenge.model.Inventory;
import byui.cit260.revenge.model.Item;
import byui.cit260.revenge.model.Map;
import byui.cit260.revenge.model.Player;
import byui.cit260.revenge.model.Satchel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import revenge.Revenge;

/**
 *
 * @author chadepeterson
 */
public class GameControl {
    private static String filepath;
    private static InputStream fips;
    private static Object game;
    public static void createNewGame(Player player) throws MapControlException{
        
        Game game = new Game();  //create new game
        Revenge.setCurrentGame(game); //save in Revenge
        
        game.setPlayer(player); //save player to game
        
        //create Inventory list and save in game
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Satchel satchel = new Satchel();  //creat new satchel
        game.setSatchel(satchel);  //save satchel to game
        
        Map map = MapControl.createMap(); //create and initialize new map
        game.setMap(map); // save map to game
        
        //move actors to starting positions in the map
        MapControl.moveActorsToStartingLocation(map); 
    }

    public static Player getPlayer() {
        Player player = Revenge.getPlayer();
        return player;
    }

    public static Inventory[] getSortedInventoryList() {
        
        //get inventory list for the current game
        Inventory[] originalInventoryList = 
                Revenge.getCurrentGame().getInventory();
        
        //clone originalList
        Inventory[] inventoryList = originalInventoryList.clone();
        
        //using a BubbleSort to sort the list of inventoryList by name
        Inventory tempInventory;
        for (int i = 0; i < inventoryList.length-1; i++){
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j+1].getDescription()) > 0) {
                        tempInventory = inventoryList[j];
                        inventoryList[j] = inventoryList[j+1];
                        inventoryList[j+1] = tempInventory;
            }
        }
    }
    return inventoryList;
}

    private static Inventory[] createInventoryList() {
        
        // create array(list) of inventory items
        Inventory[] inventory = new Inventory[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        Inventory potion = newInventory();
        potion.setItemDescription("Potion");
        potion.setQuantityItem(0);
        potion.setEquipped(null);
        inventory[Item.potion.ordinal()] = potion;
        
        Inventory bandage = newInventory();
        bandage.setItemDescription("Bandage");
        bandage.setQuantityItem(0);
        bandage.setEquipped(null);
        inventory[Item.bandage.ordinal()] = bandage;
        
        Inventory artifact = newInventory();
        artifact.setItemDescription("Artifact");
        artifact.setQuantityItem(0);
        artifact.setEquipped(null);
        inventory[Item.artifact.ordinal()] = artifact;
        
        return inventory;
    }


    private static Inventory newInventory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void getSavedGame(String filePath) 
                        throws GameControlException, IOException, ClassNotFoundException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();
            
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
                }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());    
                }
        Revenge.setCurrentGame(game);
        }

    public static void saveGame(Game currentGame, String filePath) 
        throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filepath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game object out to file
            
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    
    }
    }


