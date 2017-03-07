package sportsequipmentproject;

/**
 * A class to model an address of a customer.
 * 
 * @author Ali Jarjis
 */
public class Address {
    private String addressLine;
            // Stores customer's street and/or house number
    private String city;
            // Stores customer's city.
    private String postcode;
            // Stores customer's postcode.

    /**
     * Creates a new instance of Address
     * @param addressLine   customer's street and/or house number
     * @param city          customer's city
     * @param postcode      customer's postcode
     */
    public Address(String addressLine, String city, String postcode) {
        this.addressLine = addressLine;
        this.city = city;
        this.postcode = postcode;
    }

    /**
     * @return the customer's street and/or house number
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * Set the customer's street and/or house number
     * @param addressLine   customer's street and/or house number
     */
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * @return the customer's city 
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the customer's city
     * @param city  customer's city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return customer's postcode 
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets customer's postcode
     * @param postcode customer's postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\nAddress:\n");
        str.append(addressLine).append(",\n");;
        str.append(city).append(",\n");
        str.append(postcode).append("\n");
        return str.toString();
    }
    
    
}
