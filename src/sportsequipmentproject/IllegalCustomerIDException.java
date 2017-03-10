package sportsequipmentproject;

/**
 *
 * @author Ali Jarjis
 */
public class IllegalCustomerIDException extends Exception {

    /** Creates an IllegalCustomerIDException with a default message. */
    public IllegalCustomerIDException() {
        super("Given customer ID is not valid.");
    }
    
    /**
     * Creates a IllegalCustomerIDException with a given message 
     * @param message   message to override default message
     */
    public IllegalCustomerIDException(String message) {
        super(message);
    }
}
