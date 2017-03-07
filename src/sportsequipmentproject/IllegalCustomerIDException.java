package sportsequipmentproject;

/**
 *
 * @author Ali
 */
public class IllegalCustomerIDException extends Exception {

    /** Creates an IllegalCustomerIDException with a default message. */
    public IllegalCustomerIDException() {
        super("Given customer ID is not valid.");
    }
}
