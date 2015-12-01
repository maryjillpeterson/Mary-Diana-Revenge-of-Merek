/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.revenge.exceptions;

/**
 *
 * @author chadepeterson
 */
public class BattleControlException extends Exception{

    public BattleControlException() {
    }

    public BattleControlException(String message) {
        super(message);
    }

    public BattleControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public BattleControlException(Throwable cause) {
        super(cause);
    }

    public BattleControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
