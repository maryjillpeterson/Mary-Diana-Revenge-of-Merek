/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.revenge.exceptions;

/**
 *
 * @author Diana
 */
public class QuestControlException extends Exception {

    public QuestControlException() {
    }

    public QuestControlException(String message) {
        super(message);
    }

    public QuestControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestControlException(Throwable cause) {
        super(cause);
    }

    public QuestControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    
    }
}
