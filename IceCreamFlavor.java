import java.util.*;
class IceCreamFlavor
{
    private String name;
    private double price;
    
    /**
     * Ice Cream flavor constructor
     * @param name (of the flavor)
     * @param price (of the flavor)
    */
    public IceCreamFlavor(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    /**
     * Getter method for name
     * @return name of the flavor
     */
    public String getName() {
        return name;
    }
    
    /**
     * Getter method for price
     * @return price of the flavor
     */
    public double getPrice() {
        return price;
    }
    
}
