/**
     * Main Method to run the Ice Cream Shop
     */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IceCreamShop shop = new IceCreamShop();
        ShoppingCart order = new ShoppingCart();
            
        System.out.println("Welcome to Aryan's Summer Desserts!");
        
        boolean one = true;
        while(true) {
            System.out.println("\nSelect an option: ");
            System.out.println("1. View Menu ");
            System.out.println("2. Add a Scoop to your Shopping Cart ");
            System.out.println("3. Remove a Scoop from your Shopping Cart ");
            System.out.println("4. View Shopping Cart ");
            System.out.println("5. Checkout ");
                
            int option = input.nextInt();
            if(option == 1) {
                shop.displayMenu();
            } else if(option == 2) {
                System.out.println("Select the flavor of your scoop with its corresponding number: ");
                int flavorChoice = input.nextInt();
                IceCreamFlavor selectedFlavor = shop.getFlavor(flavorChoice);
                if(selectedFlavor != null) {
                    order.addScoop(selectedFlavor);
                    System.out.println("Scoop of " + selectedFlavor.getName() + " added to your order.");
                } else {
                    System.out.println("Invalid flavor choice :( ");
                }
            } else if(option == 3) {
                if(order.getSize() > 0) {
                    System.out.println("Enter the index of the scoop you want to remove: ");
                    int scoopIndex = input.nextInt();
                    order.removeScoop(scoopIndex);
                    System.out.println("Scoop removed from your order!");
                } else {
                    System.out.println("Your shopping cart is empty :( ");
                }
            } else if(option == 4) {
                if(order.getSize() > 0) {
                    System.out.println("Your Shopping Cart: ");
                    for(int i = 0; i < order.getSize(); i++) {
                        IceCreamFlavor scoop = order.getScoop(i);
                        System.out.println((i+1) + ". " + scoop.getName() + " - $" + scoop.getPrice());
                    }
                    System.out.println("total Cost: $" + order.getTotalCost());
                } else {
                    System.out.println("Your order is empty.");
                }
            } else if(option == 5) {
                System.out.println("Your order comes to a total of $" + order.getTotalCost());
                System.out.println("Have a good day!");
                one = false;
                input.close();
                System.exit(0);
            } else {
                System.out.println("Invalid option :( ");
            }
        }
    }
}
