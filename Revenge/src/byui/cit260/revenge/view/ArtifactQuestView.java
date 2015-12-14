/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.view;

/**
 *
 * @author chadepeterson
 */
public class ArtifactQuestView {
    public ArtifactQuestView(){
        super("\n------------------------------------------------------"
            + "\nA bandit has recently stolen a priceless artifact from"
            + "\nthis county. In order for you to gain the trust of the county"
            + "\nyou must retreive the artifact. Continue on in the game, "
            + "\nfind the bandit in the country, and battle him for the artifact."
            + "\nOnce you find the artifact, it will automatically be returned to us."                
            + "\n------------------------------------------------------"
            + "\nDo you wish to complete this Quest?"
            + "\nY - Yes   or   N - No"
            + "\n------------------------------------------------------");
    }
     public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'Y': //return to the map
            case 'y':
                this.backMoveMenu();
                break;
            case 'N': //return to Main Menu
            case 'n':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
         return false;
    }
     
     private void backMoveMenu() {
                //display the help menu
        MoveActorView MoveActorView = new MoveActorView();
        MoveActorView.display();
    }
}
