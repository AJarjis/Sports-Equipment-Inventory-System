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
}
