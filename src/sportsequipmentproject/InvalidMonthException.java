package sportsequipmentproject;

/**
 *
 * @author Ali
 */
public class InvalidMonthException extends Exception {

     /** Creates an InvalidMonthException with a default message. */
    public InvalidMonthException() {
        super("Invalid month given.");
    }
    
    /**
     * Creates a InvalidMonthException with a given message 
     * @param message   message to override default message
     */
    public InvalidMonthException(String message) {
        super(message);
    }
}
