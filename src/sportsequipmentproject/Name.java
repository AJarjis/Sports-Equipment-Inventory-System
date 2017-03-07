package sportsequipmentproject;

/**
 * A class to model a name of a private customer.
 * 
 * @author Ali Jarjis
 */
public class Name {
    private String title;
            // Stores private customer's title.
    private String initials;
            // Stores private customer's initials.
    private String lastName;
            // Stores private customer's last name.
    
    /**
     * Creates a new instance of Name
     * @param title         private customer's title
     * @param initials      private customer's initials
     * @param lastName      private customer's title
     */
    public Name(String title, String initials, String lastName) {
        this.title = title;
        this.initials = initials;
        this.lastName = lastName;
    }
    
    /**
     * @return the customer's title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets customer's title
     * @param title customer's title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the customer's initials
     */
    public String getInitials() {
        return initials;
    }
    
    /**
     * Sets customer's initials
     * @param initials customer's initials
     */
    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * @return the customer's last name 
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets customer's last name
     * @param lastName customer's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\nName: ");
        str.append(title).append(" ");;
        str.append(initials).append(". ");
        str.append(lastName).append("\n");
        return str.toString();
    }
    
    
    
}
