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
}
