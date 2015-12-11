/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.model;

import byui.cit260.revenge.view.ErrorView;
import byui.cit260.revenge.view.View;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chadepeterson
 */
public class RiddleMenuView extends View{
    
    public RiddleMenuView() {
        super("\n--------------------------------------------"
            +"\n Get the answer to this riddle correct and you "
                + "\ncan move on in the game"
                + "\n-----------------------------------------"
                + "\nDo you wish to continue with the riddle? Y - Yes N - No");
    }
    

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'Y': //display Riddle
            case 'y':
        {
            try {
                this.getRiddleAnswer();
            } catch (IOException ex) {
                ErrorView.display(getClass().getName(), 
                            "Error reading input" + ex.getMessage());
            }
        }
                break;
            case 'N': //return to Quest scene
            case 'n':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
         return false;
    }
    
    private String getRiddleAnswer() throws IOException { 
        boolean valid = false; 
        String riddleAnswer = null;
        
        while (riddleAnswer == null) {
                this.console.println("What has a face and two hands but no arms or legs? Enter your answer below:");
                
                try {
                    riddleAnswer = this.keyboard.readLine();
                    riddleAnswer = riddleAnswer.trim();
                } catch (IOException ex) {
                    ErrorView.display(getClass().getName(), 
                            "Error reading input" + ex.getMessage());
                    return null;
                }
                
            return riddleAnswer;
    }
        
         if("clock".equals(riddleAnswer)){
                    System.out.println("You got the answer correct! You can move to the next quest.");
                } else {
                    this.console.println("Sorry, try again.");
  }
        return null;
    }
}

    


   
