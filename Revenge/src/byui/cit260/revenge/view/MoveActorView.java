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
class MoveActorView extends View {

    public MoveActorView() {
        super("\nInput direct: N, E, S, or W:");
    }

     @Override
     public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'N': //move one point north
            case 'n':
                this.moveNorth();
                break;
            case 'E': //move one point east
            case 'e':
                this.moveEast();
                break;
            case 'S': //move one point south
            case 's':
                this.moveSouth();
                break;
            case 'W': //move one point south
            case 'w':
                this.moveWest();
                break;
            case 'Q': //leave the move function
            case 'q':
                return true;
            default:
                System.out.println("\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
         return false;
    }
 //need to add funtions to capture current location and decrease row count by 1
    private void moveNorth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 //need to add funtions to capture current location and increase column count by 1
    private void moveEast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//need to add funtions to capture current location and increase row count by 1
    private void moveSouth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 //need to add funtions to capture current location and decrease column count by 1
    private void moveWest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

