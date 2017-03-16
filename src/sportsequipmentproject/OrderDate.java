package sportsequipmentproject;

/**
 * A class to model the date of an order.
 * 
 * @author Ali Jarjis
 */
public class OrderDate {
    private String date; //Stores date in format dd/mm/yy

    /**
     * Creates an instance of OrderDate
     * @param date  must have the format "dd/mm/yy" otherwise
     * @throws IllegalDateFormatException 
     */
    public OrderDate(String date) throws IllegalDateFormatException {
        if (isValidDate(date)) {
            this.date = date;
        } else {
            throw new IllegalDateFormatException();
        }
    }

    /**
     * @return the date of an order
     */
    public String getDate() {
        return date;
    }
    
    /**
     * @return the month from date string
     */
    public int getMonth() {
        return Integer.parseInt(date.substring(4, 5));
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
            throw new IllegalDateFormatException();
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
        StringBuilder str = new StringBuilder("\nDate Ordered: ");
        str.append(date);
        return str.toString();
    }
}
