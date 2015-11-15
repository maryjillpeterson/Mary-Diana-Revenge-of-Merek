/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.view;

import byui.cit260.revenge.model.Riddle;

/**
 *
 * @author Diana
 */
public class RiddleQuestView extends View{
    
    public RiddleQuestView(Riddle riddle){
        super("\n------------------------------------------------------"
            + "\nThe old woman says:"
            + riddle
            + "\n------------------------------------------------------"
            + "\n What is the answer?"
            + "\n------------------------------------------------------");
}
  // need to code to get answer and comare the "Riddle answer"
    @Override
     public boolean doAction(Object obj) {
        String value = (String) obj;
        
        
        if (value.equals(Riddle.answer)){
         this.questUpdate();
        }
            else{
           System.out.println("You are wrong.  Try again");
                 }
        return false;
     }

    private void questUpdate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }

