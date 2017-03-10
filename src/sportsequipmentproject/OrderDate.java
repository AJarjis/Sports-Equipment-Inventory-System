package sportsequipmentproject;

/**
 * A class to model the date of an order.
 * 
 * @author Ali Jarjis
 */
public class OrderDate {
    private String date;

    /**
     * Creates an instance of OrderDate
     * @param date  must have the format "dd/mm/yy" otherwise
     * @throws IllegalDateFormatException 
     */
    public OrderDate(String date) throws IllegalDateFormatException {
        if (isValidDate(date)) {
            this.date = date;
        } else {
            throw new IllegalDateFormatException
                                    ("Date provided is in incorrect format.");
        }
    }

    /**
     * @return the date of an order
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date of an order if the format is correct.
     * @param date must have the format "dd/mm/yy" otherwise
     * @throws IllegalDateFormatException
     */
    public void setDate(String date) throws IllegalDateFormatException {
        if (isValidDate(date)) {
            this.date = date;
        } else {
            throw new IllegalDateFormatException
                                    ("Date provided is in incorrect format.");
        }
    }
    
    /**
     * Tests whether a given date is in format "dd/mm/yy"
     * @param date  order date, must have the format "dd/mm/yy"
     * @return true or false depending on whether date is in correct format
     */
    public boolean isValidDate(String date) {
        return date.matches("([0-9]{2})/([0-9]{2})/([0-9]{2})");
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\nDate: ");
        str.append(date);
        return str.toString();
    }
}
