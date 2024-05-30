import java.util.ArrayList;
class ShoppingCart 
{
    private ArrayList<IceCreamFlavor> scoops;
    
    /**
     * Ice Cream order Constructor
     */
    public ShoppingCart() {
        scoops = new ArrayList<>();
    }
    
    /**
     * Adds one scoop of ice cream to the shopping cart
     * @param flavor (of the ice cream)
     */
    public void addScoop(IceCreamFlavor flavor) {
        scoops.add(flavor);
    }
    
    /**
     * Remove one scoop of ice cream from shopping cart
     * @param index (of the scoop to remove)
     */
    public void removeScoop(int index) {
        if(index >= 0 && index < scoops.size()) {
            scoops.remove(index);
        }
    }
    
    /**
     * Getter method for total cost of shopping cart
     * @return total cost of shopping cart
     */
    public double getTotalCost() {
        double total = 0;
        for(IceCreamFlavor scoop : scoops) {
            total += scoop.getPrice();
        }
        return total;
    }
    
    /**
     * Getter method for the number of scoops in the shopping cart
     * @return number of scoops in shopping cart
     */
    public int getSize() {
        return scoops.size();
    }
    
    /**
     * Getter method for the scoop flavor at a given index
     * @param index (of the scoop)
     * @return flavor of scoop
     */
    public IceCreamFlavor getScoop(int index) {
        if(index >= 0 && index < scoops.size()) {
            return scoops.get(index);
        }
        return null;
    }
    
}
