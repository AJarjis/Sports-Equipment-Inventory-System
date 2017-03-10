package sportsequipmentproject;


/**
 * @author Geoff McKeown
 * @author Ali Jarjis
 */
public class CustomerNotFoundException extends Exception{
    
    /** Creates a CustomerNotFoundException with a default message */
    public CustomerNotFoundException() {
        super("Given ID does not correspond to any customer.");
    }
    
    /**
     * Creates a CustomerNotFoundException with a given message 
     * @param message   message to override default message
     */
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
