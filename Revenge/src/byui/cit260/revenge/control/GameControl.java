

package byui.cit260.revenge.control;

import byui.cit260.revenge.model.Game;
import byui.cit260.revenge.model.Inventory;
import byui.cit260.revenge.model.Inventory.Item;
import byui.cit260.revenge.model.Map;
import byui.cit260.revenge.model.Satchel;
import java.io.Serializable;
import revenge.Revenge;

/**
 *
 * @author chadepeterson
 */
public class GameControl {
    public static void createNewGame(Player player){
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Inventory[] getSortedInventoryList() {
        Inventory[] originalInventoryList = 
                Revenge.getCurrentGame().getInventory();
        
        Inventory[] inventoryList = originalInventoryList.clone();
        
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
    
    public class satchel implements Serializable{
        private String description;
        private double maxCapacity;
        
        public satchel() {
            this.description = "\nThese are the items that you have in your satchel."
                                + "\nThey will help you on your quest.";
            this.maxCapacity = 0;
        }
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
}

