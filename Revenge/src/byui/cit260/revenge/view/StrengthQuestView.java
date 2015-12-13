/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.view;

import byui.cit260.revenge.model.Battle;

/**
 *
 * @author Diana
 */
public class StrengthQuestView extends View {
    
    public StrengthQuestView(Battle opponent){
        super("\n------------------------------------------------------"
            + "\nTo complete the Quest of Strength you must battle one"
            + "\nof the lord's best warriors.  For this battle, he has"
            + "\nchosen your opponent."
            + "\n------------------------------------------------------"
            + "\nYou will have 10 life points to start off your battle."
            + "\nYour opponent will have 10 life points to start as well."
            + "\nEach attack will take life points away. You can use your healing potion"
            + "\nto increase your life points when you lose them." 
            + "\n------------------------------------------------------"
            + "\nDo you wish to Battle?"
            + "\nY - Yes   or   N - No"
            + "\n------------------------------------------------------");
    }
     @Override
     public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'Y': //display Battle Menu
            case 'y':
                this.displayBattleMenu();
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
     
     private void displayBattleMenu() {
                //display the help menu
        BattleMenuView battleMenuView = new BattleMenuView();
        battleMenuView.display();
    }
}
