package sportsequipmentproject;


/**
 * A class to model a customer of a sports equipment company.
 * The class is abstract because it contains an abstract method to get
 * the percentage discount given to the customer by the company.
 * 
 * @author Geoff McKeown
 * @author Ali Jarjis
 */
public abstract class CustomerDetails implements Comparable<CustomerDetails> {
    protected String customerID;    
                // 3 letters, followed by a hyphen, followed by 4 digits. The 
                // first of the 3 letters is a code for the type of customer:
                // 'P' for private individual and 'C' for sports club. 
                // The second and third letters are the code for one of the  
                // company's regions
                                    
    protected Address fullAddress;
    protected String regionalCode;
                // regionalCode must be two characters SC("Scotland"), 
                // WA("Wales"), NI("Northern Ireland"), NE("North East"),  
                // NW("North West"), MI("Midlands"), EA("East Anglia"), 
                // SE("South East"), SW("South West"), GL("Greater London")
    
    protected double totalValueOfOrders;    
                    // Total value of all previous orders during the last 12  
                    // months, including the current month. This total does not
                    // include the value of orders placed more than a year ago.
                                               
    /**
     * Creates a new instance of CustomerDetails
     * @param customerID        unique customer ID
     * @param customerAddress   customer's address
     * @throws IllegalCustomerIDException   if the customerID String does 
     *                                  not have the required format
     */
    public CustomerDetails(String customerID, Address customerAddress) 
                                              throws IllegalCustomerIDException{
        if ( isValidCustomerID(customerID) ){
            this.customerID = customerID;
            this.fullAddress = customerAddress;
            this.regionalCode = customerID.substring(1,3);
            this.totalValueOfOrders = 0;
        }
        else
            throw new IllegalCustomerIDException
                                        ("Given ID string has incorrect format.");        
    }
    
  /**
   * @return the sport equipment company's ID for this customer
   */
    public String getCustomerID(){
        return customerID;
    }
    
    /**
     * @return the full address of this customer
     */
    public Address getAddress(){
        return fullAddress;
    }
    
    /** 
     * @return the code for the region this customer is in.
     */
    public String getRegionalCode(){
        return regionalCode;
    }
    
    /**
     * 
     * @return  Total value of all previous orders during the last 12  
     *          months, including the current month. This total does not
     *          include the value of orders placed more than a year ago.
     */
    public double getTotalValueOfOrders(){
        return totalValueOfOrders;
    }
    
    /**
     * Method to update the total value of orders placed by this customer during 
     * the last 12 months. This needs to be done when the customer places a new 
     * order and when an old order becomes more than 12 months old.
     * @param newAmount     the amount total value is to be changed to
     */
    public void resetTotalValueOfOrders(double newAmount){
        totalValueOfOrders = newAmount;
    }
    
    /**
     * @return this customer's discount
     */
    public abstract int getDiscount();
    
   
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\nCustomer ID: ");
        str.append(customerID).append("\nCustomer address: ");
        str.append(fullAddress).append("\nRegion: ");
        str.append(regionalCode);
        return str.toString();
    }
   
    // checks whether or not a given string has the correct format for a 
    // customer ID string
    private boolean isValidCustomerID(String str){
        if (str.length() != 8)
            return false;
        else{
        // first character must be a valid customer type code ('P' for private
        // individual, 'C' for sports club)
            if (!str.substring(0,1).matches("[P,C]"))
                return false;
            else{// check whether or not next 2 characters correspond to one of 
                 // the company's regional codes
                String  regCode = str.substring(1,3);
                if (!isValidCode(regCode))
                    return false;
                else{
                    return str.substring(3,8).matches("[-]\\d{4}");    
                }
            }
        }
    }
    
    // method to determine whether or not a two character string is a valid
    // regional code of the company
    private boolean isValidCode(String regCode){
        String first = regCode.substring(0,1);
        String second = regCode.substring(1,2);
        return first.matches("[S,s]") && second.matches("[C,c,W,w,E,e]")
                || (first.matches("[N,n]") && second.matches("[I,i,W,w,E,e]"))
                || (first.matches("[W,w,E,e]") && second.matches("[A,a]"))
                || (first.matches("[G,g]") && second.matches("[L,l]"))
                || (first.matches("[M,m]") && second.matches("[I,i]"));     
     }

    /**
     * Compares the ID's of two CustomerDetails objects.. 
     * @param otherCustomer     customer to compare with
     * @return                  0 if equal,
     *                          negative if lexicographically less,
     *                          positive if lexicographically more
     */
    @Override
    public int compareTo(CustomerDetails otherCustomer){
        return this.customerID.compareTo(otherCustomer.getCustomerID());
    }
    
    
}
