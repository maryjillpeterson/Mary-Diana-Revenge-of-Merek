

package byui.cit260.revenge.control;

import byui.cit260.revenge.exceptions.GameControlException;
import byui.cit260.revenge.exceptions.MapControlException;
import byui.cit260.revenge.model.Game;
import byui.cit260.revenge.model.Inventory;
import byui.cit260.revenge.model.Item;
import byui.cit260.revenge.model.Map;
import byui.cit260.revenge.model.Player;
import byui.cit260.revenge.model.Quest;
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
        
        //create Quest list and save in game
        Quest[] QuestList = GameControl.createQuestList();
        game.setQuest(QuestList);
        
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
                if (inventoryList[j].getItemDescription().
                        compareToIgnoreCase(inventoryList[j+1].getItemDescription()) > 0) {
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
        
        Inventory potion = new Inventory();
        potion.setItemDescription("Potion");
        potion.setQuantityItem(0);
        potion.setEquipped(null);
        inventory[Item.potion.ordinal()] = potion;
        
        Inventory bandage = new Inventory();
        bandage.setItemDescription("Bandage");
        bandage.setQuantityItem(0);
        bandage.setEquipped(null);
        inventory[Item.bandage.ordinal()] = bandage;
        
        Inventory artifact = new Inventory();
        artifact.setItemDescription("Artifact");
        artifact.setQuantityItem(0);
        artifact.setEquipped(null);
        inventory[Item.artifact.ordinal()] = artifact;
        
        return inventory;
    }
    
public static Quest[] getSortedQuestList() {
        
        //get quest list for the current game
        Quest[] originalQuestList = 
                Revenge.getCurrentGame().getQuest();
        
        //clone originalList
        Quest[] questList = originalQuestList.clone();
        
        //using a BubbleSort to sort the list of inventoryList by name
        Quest tempQuest;
        for (int i = 0; i < questList.length-1; i++){
            for (int j = 0; j < questList.length-1-i; j++) {
                if (questList[j].getQuestType().
                        compareToIgnoreCase(questList[j+1].getQuestType()) > 0) {
                        tempQuest = questList[j];
                        questList[j] = questList[j+1];
                        questList[j+1] = tempQuest;
            }
        }
    }
    return questList;
}    
    
    private static Quest[] createQuestList(){
        
        // create array(list) of Quests
        Quest[] quest = new Quest[Constants.NUMBER_OF_QUESTS];
        
        Quest container = new Quest();
        container.setQuestName("Storage Container Quest");
        container.setQuestType("Storage Container Quest");
        container.setQuestCounty("");
        container.setAvailable("Storage Container Quest");
        container.setComplete("Storage Container Quest");
        
        Quest artifact = new Quest();
        artifact.setQuestName("Artifact Quest");
        artifact.setQuestType("Artifact Quest");
        artifact.setQuestCounty("");
        artifact.setAvailable("Artifact Quest");
        artifact.setComplete("Artifact Quest");

        Quest shipment = new Quest();
        shipment.setQuestName("Shipment Quest");
        shipment.setQuestType("Shipment Quest");
        shipment.setQuestCounty("");
        shipment.setAvailable("Shipment Quest");
        shipment.setComplete("Shipment Quest");
        
        Quest riddle = new Quest();
        riddle.setQuestName("Riddle Quest");
        riddle.setQuestType("Riddle Quest");
        riddle.setQuestCounty("");
        riddle.setAvailable("Riddle Quest");
        riddle.setComplete("Riddle Quest");
        
        Quest strength = new Quest();
        strength.setQuestName("Strength Quest");
        strength.setQuestType("Strength Quest");
        strength.setQuestCounty("");
        strength.setAvailable("Strength Quest");
        strength.setComplete("Strength Quest");
        
        return quest;

  
    }

    public static void getSavedGame(String filePath) 
                        throws GameControlException, IOException, ClassNotFoundException {
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        Game game = null;
        
        try(@SuppressWarnings("LocalVariableHidesMemberVariable")
 FileInputStream fips = new FileInputStream(filepath)){
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
        try( FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //write the game object out to file
            
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
    
    }
}


