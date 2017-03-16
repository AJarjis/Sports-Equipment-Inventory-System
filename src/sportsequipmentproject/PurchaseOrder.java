package sportsequipmentproject;

import java.text.NumberFormat;

/**
 * A class to model a purchase order record for a sports equipment company
 * @author Geoff McKeown
 * @author Ali Jarjis
 */
public class PurchaseOrder {
     
    private OrderDate dateOrderPlaced; // Stores date in format dd/mm/yy
    private String customerID;      // Stores customer ID
    private Product productType;    // Stores product purchased    
    private int quantityOrdered;    // Stores quantity purchased of product
    private int customerDiscount;   // Stores discount customer is entitled to
    
    /**
     * creates a new purchase order record
     * @param orderDate             date in format dd/mm/yy   
     * @param customerID            customer ID
     * @param pType                 product purchased  
     * @param quantityOrdered       quantity purchased of product
     * @param customerDiscount      discount customer is entitled to
     */
    public PurchaseOrder(OrderDate orderDate, String customerID, Product pType, 
                                  int quantityOrdered, int customerDiscount){
            this.dateOrderPlaced = orderDate;
            this.customerID = customerID;
            this.productType = pType;
            this.quantityOrdered = quantityOrdered;
            this.customerDiscount = customerDiscount;
    }
    
    /**
     * @return the date the purchase order was placed
     */
    public OrderDate getDateOfOrder(){
        return dateOrderPlaced;
    }
    
    /**
     * @return the id of the customer placing the purchase order
     */
    public String getCustomerID(){
        return customerID;
    }
    
    /**
     * @return the product the purchase order is for
     */
    public Product getProductType(){
        return productType;
    }
    
    /**
     * @return the value of the purchase order
     */
    public double getValueOfOrder(){
        return quantityOrdered * productType.getUnitPrice();
    }
    
    /**
     * @return the amount of the invoice after taking any discount into account
     */
    public double getInvoiceAmount(){
        return (1 - (double) customerDiscount/100 ) * getValueOfOrder();
    }
       
    @Override
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        StringBuilder str = new StringBuilder();
        str.append(dateOrderPlaced).append("\nCustomer ID: ");
        str.append(customerID).append(productType);
        str.append("\nQuantity ordered: ").append(quantityOrdered);
        str.append("\nValue of Order: ").append(fmt.format(getValueOfOrder()));
        str.append("\nAmount of customer Invoice: ");
        str.append(fmt.format(getInvoiceAmount()));
        str.append("\n---------------------------------------------\n");
        return str.toString();
    }
}
