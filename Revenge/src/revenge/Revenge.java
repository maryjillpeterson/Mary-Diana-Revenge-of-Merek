/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revenge;

import byui.cit260.revenge.model.Actor;
import byui.cit260.revenge.model.Game;
import byui.cit260.revenge.model.Location;
import byui.cit260.revenge.model.Map;
import byui.cit260.revenge.model.Player;
import byui.cit260.revenge.model.QuestScene;
import byui.cit260.revenge.model.RegularScene;
import byui.cit260.revenge.model.Satchel;
import byui.cit260.revenge.view.BattleMenuView;
import byui.cit260.revenge.view.GameMenuView;
import byui.cit260.revenge.view.HelpMenuView;
import byui.cit260.revenge.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 *
 * @author marypeterson
 */
public class Revenge {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//create StartProgramView and start the program
        
        try {
            //open character stream files for end user input and output
            Revenge.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            Revenge.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            Revenge.logFile = new PrintWriter(filePath);
            
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
        
        //BattleMenuView battleMenuView = new BattleMenuView();
        //battleMenuView.displayMenu();
        //GameMenuView gameMenuView = new GameMenuView();
        //gameMenuView.displayMenu();
        //} catch (Throwable te) {
          //  System.out.println(te.getMessage());
            //te.printStackTrace();
            //startProgramView.displayBanner();
        } catch (Throwable e){
                System.out.println("Exception: " + e.toString()+
                                    "\nCause: " + e.getCause() +
                                    "\nMessage: " + e.getMessage());
                e.printStackTrace();;
        }
        finally {
            try{
                if (Revenge.inFile != null)
                    Revenge.inFile.close();
            
                if (Revenge.outFile !=null)
                    Revenge.outFile.close();
                
                if (Revenge.logFile !=null)
                    Revenge.logFile.close();
            }
            catch (IOException ex){
                System.out.println("Error closing files");
                return;
            }
        }
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Revenge.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Revenge.player = player;
    }

    public static Location[][] getLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static PrintWriter getOutFile(){
        return outFile;
    }
    
    public static void setOutFile(PrintWriter outFile){
        Revenge.outFile = outFile;
    }
    
    public static BufferedReader getInFile() {
        return inFile;
    }
    
    public static void setInFile(BufferedReader inFile) {
        Revenge.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }
    public static void setLogFile(PrintWriter logFile){
        Revenge.logFile = logFile;
    }

    
    
}
