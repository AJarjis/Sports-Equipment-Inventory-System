package sportsequipmentproject;

/**
 *
 * @author Ali
 */
public class IncorrectPurchaseOrderException extends Exception {

    /**
     * Creates an IncorrectPurchaseOrderException with default message.
     */
    public IncorrectPurchaseOrderException() {
        super("Error adding purchase order. Details incorrect.");
    }
    
    /**
     * Creates a IncorrectPurchaseOrderException with a given message 
     * @param message   message to override default message
     */
    public IncorrectPurchaseOrderException(String message) {
        super(message);
    }
}
