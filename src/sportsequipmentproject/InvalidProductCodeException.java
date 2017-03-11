package sportsequipmentproject;

/**
 *
 * @author Ali
 */
public class InvalidProductCodeException extends Exception {

    /**
     * Creates an InvalidProductCodeException with default message.
     */
    public InvalidProductCodeException() {
        super("Product code is in incorrect format.");
    }
    
    /**
     * Creates a InvalidProductCodeException with a given message 
     * @param message   message to override default message
     */
    public InvalidProductCodeException(String message) {
        super(message);
    }
}
