package sportsequipmentproject;

import java.util.ArrayList;

/**
 * A class to model a collection of CustomerDetails objects.
 * @author Ali Jarjis
 */
public class CustomerDetailsList {
    private ArrayList<CustomerDetails> customers;
                                    // Stores all customers: private and club
    
    /**
     * Creates a new empty instance of CustomerDetailsList
     */
    public CustomerDetailsList() {
        customers = new ArrayList<CustomerDetails>();
    }
    
    /**
     * Adds a customer details to array
     * @param newCustomer   customer details to add
     */
    public void addCustomer(CustomerDetails newCustomer) {
        customers.add(newCustomer);
    }
    
    /**
     * @return size of customers arrayList
     */
    public int numberOfCustomers() {
        return customers.size();
    }
}
