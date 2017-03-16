package sportsequipmentproject;

import java.util.ArrayList;
import java.util.Collections;

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
     * Adds a customer details to arrayList and then sorts
     * @param newCustomer   customer details to add
     */
    public void addCustomer(CustomerDetails newCustomer) {
        customers.add(newCustomer);
        sortCustomers();
    }
    
    /**
     * @return size of customers arrayList
     */
    public int numberOfCustomers() {
        return customers.size();
    }
    
    /**
     * Sorts arrayList by customer ID in ascending order
     * Allows for easier searching
     */
    public void sortCustomers() {
        Collections.sort(customers);
    }
    
    /**
     * Searches customers ArrayList for customer's details
     * @param givenID   the ID of a customer
     * @return          the customer's details if found else
     * @throws CustomerNotFoundException
     */
    public CustomerDetails findCustomer(String givenID) 
            throws CustomerNotFoundException
    {
        int min = 0;    // Beginning of array
        int max = numberOfCustomers() - 1; // End of array
        
        // Performs a binary search to find the customer's details
        while (min <= max) {
            int mid = (min + max)/2;
            // Compares given ID with the ID in the middle of list
            int compareResult = ((customers.get(mid)).getCustomerID())
                                .compareTo(givenID);
            
            if (compareResult == 0) {
                return customers.get(mid);
            } else if (compareResult < 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        throw new CustomerNotFoundException();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Customers: ");
        str.append(customers);
        return str.toString();
    }
    
    
}
