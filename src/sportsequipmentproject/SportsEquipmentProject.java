package sportsequipmentproject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ali Jarjis
 */
public class SportsEquipmentProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Name Class Test Methods
        Name testCustomer = new Name("Mr", "A", "Jarjis");
        System.out.println(testCustomer.getTitle());
        System.out.println(testCustomer.getInitials());
        System.out.println(testCustomer.getLastName());
        System.out.println(testCustomer);
        testCustomer.setTitle("Dr");
        testCustomer.setInitials("G");
        testCustomer.setLastName("Clooney");
        System.out.println(testCustomer);
        */
        
        
        
        /* Address Class Test Methods
        Address testAddress = new Address
                            ("1, Yeatman Road", "Norwich", "NR2 5PL");
        System.out.println(testAddress.getAddressLine());
        System.out.println(testAddress.getCity());
        System.out.println(testAddress.getPostcode());
        System.out.println(testAddress);
        testAddress.setAddressLine("Greenwich University");
        testAddress.setCity("London");
        testAddress.setPostcode("N6 4DQ");
        System.out.println(testAddress);
        */
        
        
        
        /* OrderDate Class Test Methods
        try {
            OrderDate testDate = new OrderDate("21/03/98"); //Correct format
            System.out.println(testDate.getDate());
            System.out.println(testDate);
            testDate.setDate("12/11/2015"); //Incorrect format
            System.out.println(testDate);
        } catch (IllegalDateFormatException error){
            System.out.println(error);
        }
        */
        
        
        
        /* PrivateCustomerDetails Test Methods
        Name testPrivateCustomer = new Name("Mr", "A", "Jarjis");
        Address testPrivateAddress = new Address
                                    ("1, Yeatman Road", "Norwich", "NR2 5PL");
        String testID = "PSC-1235"; //Change value to test exception
        try {
            PrivateCustomerDetails testCustomerDetails = 
                            new PrivateCustomerDetails
                            (testID, testPrivateAddress, testPrivateCustomer);
            System.out.println(testCustomerDetails.getCustomerName());
            System.out.println(testCustomerDetails.getDiscount());
            System.out.println(testCustomerDetails);
        } catch (IllegalCustomerIDException error) {
            System.out.println(error);
        }
        */
        
        
        /* SportsClubDetails Test Methods
        Address testClubAddress = new Address
                                    ("1, Yeatman Road", "Norwich", "NR2 5PL");
        String testID = "CSC-1235"; //Change value to test exception
        String testClubName = "Fit Gym";
        try {
            SportsClubDetails testClubDetails = new SportsClubDetails
                                    (20, "Fit Gym", testID, testClubAddress);
            System.out.println(testClubDetails.getClubName());
            System.out.println(testClubDetails.getDiscount());
            System.out.println(testClubDetails);
            testClubDetails.setClubName("Even Fitter Gym");
            testClubDetails.setDiscount(35);
            System.out.println(testClubDetails);
        } catch (IllegalCustomerIDException error) {
            System.out.println(error);
        }
        */  
    }
}
