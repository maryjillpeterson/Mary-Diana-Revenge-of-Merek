/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.view;

/**
 *
 * @author Diana
 */
public class PuzzleMenuView extends View {

    public PuzzleMenuView() {
        super("\n------------------------------------------------------"
            + "\nThe villagers need your help to solve a puzzle.  They "
            + "\nare trying to make a barrel to store fish oil.  You will"
            + "\nthen need to carry the barrel to another village."
            + "\n------------------------------------------------------"
            + "\nDo you wish to continue?"
            + "\nY - Yes   or   N - No"
            + "\n------------------------------------------------------");
    }

     @Override
     public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'Y': //contunie on to solve puzzle
            case 'y':
                this.displayPuzzle();
                break;
            case 'N': //return to Quest scene
            case 'n':
                return true;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
         return false;
    }
     
     private void displayPuzzle() {

        System.out.println("\n------------------------------------------------------"
            + "\nThe villagers need to build a barrel to hold between 250 and 270"
            + "\nliters of fish oil.  They do not know how tall or wide the barrel"
            + "\nshould be and they need your wisdom.");
    }
       
    public Double getRadius(){
        Double radius = null;
        
        while (radius == null){
            String value = this.getInput();
            value = value.trim().toUpperCase();

            if (value.equals("Q"))
                break;
            
        try {    
            radius = Double.parseDouble(value);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
                    + "Try again or enter Q to quit.");
        }
        }
        return radius;
    }
    
    public Double getHeight(){
        Double height = null;
        
        while (height == null){
            String value = this.getInput();
            value = value.trim().toUpperCase();

            if (value.equals("Q"))
                break;
            
        try {    
            height = Double.parseDouble(value);
        } catch (NumberFormatException nf) {
            System.out.println("\nYou must enter a valid number."
                    + "Try again or enter Q to quit.");
        }
        }
        return height;
    }
}