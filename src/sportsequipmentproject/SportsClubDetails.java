package sportsequipmentproject;

/**
 * A class to model a sports club of a sports equipment company
 * @author Ali Jarjis
 */
public class SportsClubDetails extends CustomerDetails {
    private int discount; // Stores agreed discount rate.
    private String clubName; // Stores name of club

    /**
     * Creates a new instance of SportsClubDetails
     * @param discount          club's agreed discount rate.
     * @param clubName          name of club
     * @param customerID        unique customer ID
     * @param customerAddress   customer's address
     * @throws IllegalCustomerIDException   if the customerID String does 
     *                                  not have the required format
     */
    public SportsClubDetails
        (int discount, String clubName, String customerID, 
                Address customerAddress) throws IllegalCustomerIDException {
        super(customerID, customerAddress);
        
        if ( customerID.charAt(0) != 'C') {
            throw new IllegalCustomerIDException("Customer ID must begin with"
                    + " 'C' for a private individual customer");
        } else {
            this.discount = discount;
            this.clubName = clubName;
        }
    }
    
    /**
     * @return club's agreed discount
     */
    @Override
    public int getDiscount() {
        return discount;
    }

    /**
     * @param discount  new discount rate
     */
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /**
     * @return club's name 
     */
    public String getClubName() {
        return clubName;
    }

    /**
     * @param clubName  club's new name
     */
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(clubName).append("\nCurrent Discount: ");
        str.append(discount).append("%");
        str.append(super.toString());
        return str.toString();
    }
    
    
    
}
        
    
    
    
