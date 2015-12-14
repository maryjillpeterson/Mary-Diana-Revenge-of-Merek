/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

import byui.cit260.revenge.model.Battle;

/**
 *
 * @author chadepeterson
 */
public class ArtifactQuestBattleView {
    public ArtifactQuestBattleView(Battle opponent){
        super("\n------------------------------------------------------"
            + "\nYou have found the bandit! He has the artifact!"
            + "\n------------------------------------------------------"
            + "\nQuick! Do you wish to Battle him for the artifact?"
            + "\nY - Yes   or   N - No"
            + "\n------------------------------------------------------");
    }
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
