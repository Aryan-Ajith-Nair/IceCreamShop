class IceCreamShop 
{
    
    private IceCreamFlavor[] menu;
    
    /**
     * Flavor menu Constructor
     */
    public IceCreamShop() {
        // Initializes menu with its flavors and their respective prices
        menu = new IceCreamFlavor[] {
            new IceCreamFlavor("Chocolate", 3.2),
            new IceCreamFlavor("Vanilla", 2.5),
            new IceCreamFlavor("Strawberry", 4.0),
            new IceCreamFlavor("CookiesNCream", 4.45)
        };
    }
    
    /**
     * Prints menu
     */
    public void displayMenu() {
        System.out.println("Menu: ");
        for(int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i].getName() + " - $" + menu[i].getPrice());
        }
    }
    
    /**
     * Getter method for flavor from menu chosen by input
     * @param choise (flavor)
     * @return selected flavor
     */
    public IceCreamFlavor getFlavor(int choice) {
        if(choice > 0 && choice <= menu.length) {
            return menu[choice - 1];
        }
        return null;
    }
    
}
