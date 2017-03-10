package sportsequipmentproject;

/**
 *
 * @author Ali Jarjis
 */
public class IllegalDateFormatException extends Exception {

    /** Creates an IllegalDateFormatException with a default message. */
    public IllegalDateFormatException() {
        super("Given date is in incorrect format.");
    }
    
    /**
     * Creates a IllegalDateFormatException with a given message 
     * @param message   message to override default message
     */
    public IllegalDateFormatException(String message) {
        super(message);
    }
}
