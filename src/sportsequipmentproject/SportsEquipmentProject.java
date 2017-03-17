package sportsequipmentproject;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
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
//        //Name Class Test Methods
//        Name testCustomer = new Name("Mr", "A", "Jarjis");
//        System.out.println(testCustomer.getTitle());
//        System.out.println(testCustomer.getInitials());
//        System.out.println(testCustomer.getLastName());
//        System.out.println(testCustomer);
//        testCustomer.setTitle("Dr");
//        testCustomer.setInitials("G");
//        testCustomer.setLastName("Clooney");
//        System.out.println(testCustomer);
//        
//        
//        
//        
//        //Address Class Test Methods
//        Address testAddress = new Address
//                            ("1, Yeatman Road", "Norwich", "NR2 5PL");
//        System.out.println(testAddress.getAddressLine());
//        System.out.println(testAddress.getCity());
//        System.out.println(testAddress.getPostcode());
//        System.out.println(testAddress);
//        testAddress.setAddressLine("Greenwich University");
//        testAddress.setCity("London");
//        testAddress.setPostcode("N6 4DQ");
//        System.out.println(testAddress);
//        
//        
//        
//        
//        //OrderDate Class Test Methods
//        try {
//            OrderDate testDate = new OrderDate("21/03/98"); //Correct format
//            System.out.println(testDate.getDate());
//            System.out.println(testDate);
//            //testDate.setDate("12/11/2015"); //Incorrect format
//            System.out.println(testDate.getMonth());
//            System.out.println(testDate);
//        } catch (IllegalDateFormatException error){
//            System.out.println(error);
//        }
//        
//        
//        
//        
//        //PrivateCustomerDetails Test Methods
//        Name testPrivateCustomer = new Name("Mr", "A", "Jarjis");
//        Address testPrivateAddress = new Address
//                                    ("1, Yeatman Road", "Norwich", "NR2 5PL");
//        String testID = "PSC-1235"; //Change value to test exception
//        try {
//            PrivateCustomerDetails testCustomerDetails = 
//                            new PrivateCustomerDetails
//                            (testID, testPrivateAddress, testPrivateCustomer);
//            System.out.println(testCustomerDetails.getCustomerName());
//            System.out.println(testCustomerDetails.getDiscount());
//            System.out.println(testCustomerDetails);
//        } catch (IllegalCustomerIDException error) {
//            System.out.println(error);
//        }
//        
//        
//        
//        //SportsClubDetails Test Methods
//        Address testClubAddress = new Address
//                                    ("1, Yeatman Road", "Norwich", "NR2 5PL");
//        String testClubID2 = "CSC-1235"; //Change value to test exception
//        String testClubName = "Fit Gym";
//        try {
//            SportsClubDetails testClubDetails = new SportsClubDetails
//                                    (20, "Fit Gym", testClubID2, testClubAddress);
//            System.out.println(testClubDetails.getClubName());
//            System.out.println(testClubDetails.getDiscount());
//            System.out.println(testClubDetails);
//            testClubDetails.setClubName("Even Fitter Gym");
//            testClubDetails.setDiscount(35);
//            System.out.println(testClubDetails);
//        } catch (IllegalCustomerIDException error) {
//            System.out.println(error);
//        }
//          
//        //CustomerDetailsList Test Methods
//        Name pCustomer1 = new Name("Ms", "D", "Smith");
//        Name pCustomer2 = new Name("Mr", "FR", "James");
//        Name pCustomer3 = new Name("Miss", "GT", "Clooney");
//        Name pCustomer4 = new Name("Dr", "NM", "Pitt");
//        Address pAddress1 = new Address("2 Bluebell Road", "Glasgow", "E1 4PX");
//        Address pAddress2 = new Address("6 Bluebell Road", "Glasgow", "E1 4PX");
//        Address pAddress3 = new Address("7 Bluebell Road", "Glasgow", "E1 4PX");
//        Address pAddress4 = new Address("9 Bluebell Road", "Glasgow", "E1 4PX");
//        String testID1 = "PSC-1655";
//        String testID2 = "PNW-9007";
//        String testID3 = "PSW-8735";
//        String testID4 = "PMI-6238";
//        try {
//            PrivateCustomerDetails pCustomerDetails1 = new PrivateCustomerDetails
//                                                (testID1, pAddress1, pCustomer1);
//            PrivateCustomerDetails pCustomerDetails2 = new PrivateCustomerDetails
//                                                (testID2, pAddress2, pCustomer2);
//            PrivateCustomerDetails pCustomerDetails3 = new PrivateCustomerDetails
//                                                (testID3, pAddress3, pCustomer3);
//            PrivateCustomerDetails pCustomerDetails4 = new PrivateCustomerDetails
//                                                (testID4, pAddress4, pCustomer4);
//            CustomerDetailsList listOfCustomers = new CustomerDetailsList();
//            listOfCustomers.addCustomer(pCustomerDetails1);
//            listOfCustomers.addCustomer(pCustomerDetails2);
//            listOfCustomers.addCustomer(pCustomerDetails3);
//            listOfCustomers.addCustomer(pCustomerDetails4);
//            System.out.println(listOfCustomers.findCustomer(testID4));
//            //System.out.println(listOfCustomers);
//        } catch (IllegalCustomerIDException ex) {
//            System.out.println(ex);
//        } catch (CustomerNotFoundException ex) {
//            System.out.println(ex);
//        }
//        
//        // Product Test Methods
//        try {
//            Product testProduct = new Product("Ah/123", 12.342);
//            System.out.println(testProduct);
//        } catch(InvalidProductCodeException error) {
//            System.out.println(error);
//        }
//        
//        // PurchaseOrder Test Methods
//        try {
//            Product testPurchaseProduct = new Product("Ah/123", 12.342);
//            OrderDate testPurchaseDate = new OrderDate("21/03/98");
//            Name ptCustomer4 = new Name("Dr", "NM", "Pitt");
//            Address ptAddress1 = new Address("2 Bluebell Road", "Glasgow", 
//                                                                "E1 4PX");
//            PrivateCustomerDetails pCustomerDetails1 = new PrivateCustomerDetails
//                                            (testID1, ptAddress1, ptCustomer4);
//            PurchaseOrder testPurchase = new PurchaseOrder(testPurchaseDate, 
//            testID1, testPurchaseProduct, 4, pCustomerDetails1.getDiscount());
//            System.out.println(testPurchase);
//        } catch (InvalidProductCodeException e) {
//            System.out.println(e);
//        } catch (IllegalDateFormatException e) {
//            System.out.println(e);
//        } catch (IllegalCustomerIDException e) {
//            System.out.println(e);
//        }
        
        File productData = null;
        File customerData = null;
        try {
            productData = new File("productData.txt");
            customerData = new File("CustomerData.txt");
        } catch(Exception error) {
            System.out.println(error);
        }
        
        Product [] productRange = null;
        try {
            productRange = createProductList(productData);
        } catch (InvalidProductCodeException error) {
            System.out.println(error);
        }
        
        int month = 1;
        int year = 2013;
        
        SportsEquipmentSupplier mySupplier = new SportsEquipmentSupplier
                                                (productRange, month, year);
        try {
            CustomerDetailsList allCustomers = createCustomerList(customerData);
            System.out.println(allCustomers);
        } catch (IllegalCustomerIDException ex) {
            System.out.println(ex);
        }
    }

    /**
     * Creates an array of products from a given file
     * @param productData   file of products
     * @return  array of products
     * @throws InvalidProductCodeException  if product code in file is invalid 
     */
    public static Product [] createProductList(File productData) 
                                            throws InvalidProductCodeException {
        final String DELIMITER = "#";
        Scanner fileScan = null; // Stores scanned file
        
        Scanner numScan = null;    // Stores number of products line
        Scanner codeScan = null;    // Stores product code line
        Scanner priceScan = null;   // Stores prices line
        
        int numberOfProducts = 0;
        String productCode = null;
        double price = 0.0;
        
        try {
            fileScan = new Scanner(productData);
        } catch(Exception error) {
            System.out.println(error);
        }
         
        // Code for storing first line into numberOfProducts
        numScan = new Scanner(fileScan.nextLine());
        numberOfProducts = numScan.nextInt();
        
        // Code for storing second line into codeScan and defining delimiter
        codeScan = new Scanner(fileScan.nextLine());
        codeScan.useDelimiter(DELIMITER);
        
        // Code for storing third line into priceScan and defining delimiter
        priceScan = new Scanner(fileScan.nextLine());
        priceScan.useDelimiter(DELIMITER);
        
        Product [] allProducts = new Product[numberOfProducts - 1];
        
        // Takes product code and price found in file and stores in an array
        for (int i = 0; i < numberOfProducts - 1; i++) {
            productCode = codeScan.next();
            price = priceScan.nextDouble();
            
            allProducts[i] = new Product(productCode, price);
        }
        
        return allProducts;
    }  
    
    public static CustomerDetailsList createCustomerList(File customerData) throws IllegalCustomerIDException {
        final String DELIMITER = "/";
        Scanner fileScan = null;
        Scanner lineScan = null;
        String nxtLine = null;
        
        String customerID;  // customer ID
        
        // variables which make a private customer's name
        String initial;
        String title;
        String lName;
        Name privateName = null;
        
        // variables which make a customer's address
        String addressLine;
        String city;
        String postcode;

        String clubName = null;     // club's name
        int discount;               // club's discount
        
        boolean isPrivateCustomer;
        
        CustomerDetailsList allCustomers = new CustomerDetailsList();
        
        try {
            fileScan = new Scanner(customerData);
        } catch(Exception error) {
            System.out.println(error);
        }
        
        // loops through entire text file, ends when no lines found
        while (fileScan.hasNextLine()){
            // iterates through each line in the text file
            nxtLine = fileScan.nextLine();
            lineScan = new Scanner(nxtLine);
            lineScan.useDelimiter(DELIMITER);
            
            customerID = lineScan.next();
            isPrivateCustomer = customerID.charAt(0) == 'P';
            
            // if customer is a private customer stores name as Name object 
            if (isPrivateCustomer) {
                title = lineScan.next();
                initial = lineScan.next();
                lName = lineScan.next();
                privateName = new Name(title, initial, lName);
            } else {    // else store as string
                clubName = lineScan.next();
            }
            
            // collects and stores customer's address
            addressLine = lineScan.next();
            city = lineScan.next();
            postcode = lineScan.next();
            Address customerAddress = new Address(addressLine, city, postcode);
            
            // adds customer as private or club customer to allCustomers list
            if (isPrivateCustomer) {
                PrivateCustomerDetails pCustomer = new PrivateCustomerDetails
                                    (customerID, customerAddress, privateName);
                allCustomers.addCustomer(pCustomer);
            } else {
                discount = lineScan.nextInt();
                SportsClubDetails cCustomer = new SportsClubDetails
                            (discount, clubName, customerID, customerAddress);
                allCustomers.addCustomer(cCustomer);
            }
            
        }
        
        return allCustomers;
    }
}
