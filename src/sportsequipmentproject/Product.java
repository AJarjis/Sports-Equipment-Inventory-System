package sportsequipmentproject;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * A class to model a product for a sports equipment company.
 * @author Ali Jarjis
 */
public class Product {
    private String productCode;
                    // Stores product code in format aa/ddd, 
                    // a = letter, d = digit
    private double price;
                    // Stores price per unit, recorded to the nearest penny

    /**
     * Creates an instance of a product.
     * @param productCode   product code in format aa/ddd
     * @param price         price per unit
     * @throws InvalidProductCodeException      if product code is not in 
     *                                          correct format
     */
    public Product(String productCode, double price) 
                                        throws InvalidProductCodeException{
        if (isValidProductCode(productCode)) {
            this.productCode = productCode;
            this.price = roundTo(price);
        } else {
            throw new InvalidProductCodeException();
        }
    }

    /**
     * @return product code
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets product code to given code
     * @param productCode   product code in format aa/ddd else
     * @throws InvalidProductCodeException 
     */
    public void setProductCode(String productCode) 
                                throws InvalidProductCodeException {
        if (isValidProductCode(productCode)) {
            this.productCode = productCode;
        } else {
            throw new InvalidProductCodeException();
        }
    }

    /**
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set price rounded to nearest penny
     * @param price given price per unit
     */
    public void setPrice(double price) {
        this.price = roundTo(price);
    }
    
    
    
    /**
     * Checks if product code is in correct format
     * @param code  given product code
     * @return result if code is in correct format 
     */
    public boolean isValidProductCode(String code) {
        if (code.length() != 6)
            return false;
        else return code.matches("[a-zA-Z]{2}[/][0-9]{3}");
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("\nProduct Code: ");
        str.append(productCode).append("\nPrice: £");
        str.append(price);
        return str.toString();
    }
    
    /**
     * Rounds a double to 2 decimal places
     * @param value     double to round
     * @return          rounded double
     */
    public static double roundTo(double value) {
        return new BigDecimal(value).setScale
                    (2, RoundingMode.HALF_UP).doubleValue();
    }
    
}
