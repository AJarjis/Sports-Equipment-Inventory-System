package sportsequipmentproject;

import java.util.ArrayList;

/**
 * A class to model a collection of PurchaseOrder objects.
 * @author Ali Jarjis
 */
public class PurchaseOrderList {
    private ArrayList<PurchaseOrder> purchases;
                                    // Stores a list of purchase orders

    /**
     * Creates a new empty instance of PurchaseOrderList
     */
    public PurchaseOrderList() {
        purchases = new ArrayList<PurchaseOrder>();
    }
    
    /**
     * Adds a purchase order to the arrayList
     * @param newPurchaseOrder  purchase order to add
     */
    public void addPurchaseOrder(PurchaseOrder newPurchaseOrder) {
        purchases.add(newPurchaseOrder);
    }
    
    /**
     * @return size of purchases arrayList
     */
    public int numberOfPurchaseOrders() {
        return purchases.size();
    }
    
    /**
     * Converts arrayList of purchase orders into an array and then
     * @return  the array containing all the purchase orders in this list,
     *          if this list is not empty, otherwise null.
     */
    public PurchaseOrder [] getPurchaseOrders() {
        if (numberOfPurchaseOrders() > 0) {
            PurchaseOrder [] purchaseOrderArray = new 
                        PurchaseOrder[numberOfPurchaseOrders()];
            purchaseOrderArray = purchases.toArray(purchaseOrderArray);

            return purchaseOrderArray;
        }
        return null;
    }
    
    /**
     * Removes all purchase orders from the list
     */
    public void clearPurchaseOrderList() {
        purchases.clear();
    }
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Customer's Purchases: ");
        str.append(purchases);
        return str.toString();
    }
}
