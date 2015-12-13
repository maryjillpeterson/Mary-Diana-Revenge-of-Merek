/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.view;

import byui.cit260.revenge.exceptions.BattleControlException;



/**
 *
 * @author Diana
 */
public class BattleMenuView extends View {
    private int opponentLifePoints;
    private int lifePoints;
    private int numPotions;
    
    
    public BattleMenuView(){
        super("\n------------------------------------------------------"
            + "\n Your opponent is ready for battle."
            + "\n How would you like to attack first? See the menu below"
            + "\n------------------------------------------------------"
            + "\nS - Strike, P - Pummel, C - Charge,"
            + "\nH - Heal, Q - Quit Battle"
            + "\n"
            + "\nX - Displays explainations of the listed options"
            + "\n------------------------------------------------------");
        
        
     }

     @Override
     public boolean doAction(Object obj) {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        
        switch (choice){
            case 'S': //execute a strike attack
            case 's':
                this.attackStrike();
                break;
            case 'P': //execute a pummel attack
            case 'p':
                this.attackPummel();
                break;
            case 'C': //execute a charge attack
            case 'c':
                this.attackCharge();
                break;
            case 'H': //execue heal functions
            case 'h':
                this.heal();
                break;
            case 'X': //display Battle Help options
            case 'x':
                this.displayBattleHelp();
                break;
            case 'Q': //exit the battle
            case 'q':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Menu selection *** Try Again ***");
                break;
        }
         return false;
    }
    
     private void displayBattleHelp() {
        this.console.println("\n\n-------------------------------------------------------------------------------------");
                
        this.console.println("\n*                Battle Options                        *");
        
        this.console.println("-------------------------------------------------------------------------------------"
                       + "\n* Strike - Your heroicly strike at your opponent!"
                       + "\n     This attack could cause 2-3 points in damage, if you dont miss."
                       + "\n"
                       + "\n* Pummel - This is a berserker attack!  It can cause up t 8 points in damage,"
                       + "\n     but it uses a lot of your energy and will cost your a couple health points, too."
                       + "\n"
                       + "\n* Charge - You charge your opponent and catch them by surprise!  This will"
                       + "\n     stun your opponent for one turn, but you can only use it once every five turns."
                       + "\n"
                       + "\n* Heal - Drink a healing potion from your supplies.  You must already"
                       + "\n     have the potion in your satchel and you will lose a turn in battle."
                       + "\n"
                       + "\n* Quit Battle - If you select this option your will leave the battle."
                       + "\n     This action will not restore your health to your pre-battle levels,"
                       + "\n     but it will let you run away to fight another day.");
        
        this.console.println("-------------------------------------------------------------------------------------");
    }
     

    private void attackStrike() {
        if (opponentLifePoints > 0){
            opponentLifePoints = opponentLifePoints - 3;
            this.console.println("You striked your opponent and your opponent lost 3 life points. Great work! ");
        } 
    }

     
    private void attackPummel() {
        if (opponentLifePoints > 0){
            opponentLifePoints = opponentLifePoints - 8 && lifePoints = lifePoints - 2;
            this.console.println("You pummeled your opponent and your opponent lost 8 life points. However, you also lost 2 life points. Good hit! ");
        }
    }

    private boolean attackCharge(int turnNumber, int lastCharge) throws BattleControlException{
    
        if(turnNumber == 0){
            //return false;
            throw new BattleControlException("This is false.");
        }
        
        boolean validCharge = ((turnNumber - lastCharge)>= 5) || (lastCharge == 0);
        
        return validCharge;
    }
    
    }
    private void heal() {
        if (numPotions > 0){
            lifePoints = lifePoints + 3;
            this.console.println("You added 3 life points to your total.");
            
        } else {
            this.console.println("You do not have any potions left.");
        }
    
    }

    
    
    

    

    


    }


