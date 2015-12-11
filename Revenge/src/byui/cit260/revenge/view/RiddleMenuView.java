/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

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
            +"\n Get the answer to this riddle correctly and you "
                + "\ncan move on in the game"
                + "\n-----------------------------------------"
                + "\nDo you wish to continue with the riddle? Y - Yes N - No");
    }
    
    private String getRiddleAnswer(){ 
        boolean valid = false; 
        String riddleAnswer = null;
        
            while(!valid) {
                this.console.println("What has a face and two hands but no arms or legs? Enter your answer below:");
                
            try {
                riddleAnswer = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(RiddleMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
                riddleAnswer = riddleAnswer.trim();
                
                if(riddleAnswer == "/clock"){
                    System.out.println("You got the answer correct! You can move to the next quest.");
                }
            }
            return riddleAnswer;
        
        
    }

    @Override
    public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'Y': //display Riddle
            case 'y':
                this.getRiddleAnswer();
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
}
   