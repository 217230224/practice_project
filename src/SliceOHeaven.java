public class SliceOHeaven {
    // Variables
    String storeName = "Slice-o-Heaven";
    String storeAddress = "123 Pizza Lane, Food City";
    String storeEmail = "contact@sliceoheaven.com";
    String storePhone = "123-456-7890";
    String[] storeMenu = {"Margherita", "Pepperoni", "Veggie"};
    String[] pizzaIngredients = {"Cheese", "Tomato Sauce", "Toppings"};
    double pizzaPrice = 10.99;
    String[] sides = {"Garlic Bread", "Salad"};
    String[] drinks = {"Soda", "Water"};
    String orderID;
    double orderTotal;

    // Methods
    public void takeOrder(String id, String pizzaType, String[] sides, String[] drinks) {
        orderID = id;
        System.out.println("Order accepted for: " + pizzaType);
        makePizza(pizzaType);
        orderTotal = calculateTotal(pizzaType, sides, drinks);
        printReceipt();
    }

    private void makePizza(String pizzaType) {
        System.out.println("Making your " + pizzaType + " pizza...");
        try {
            Thread.sleep(3000); // Simulate pizza preparation time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Your " + pizzaType + " pizza is ready!");
    }

    private double calculateTotal(String pizzaType, String[] sides, String[] drinks) {
        double total = pizzaPrice;
        total += sides.length * 2.99; // Each side costs $2.99
        total += drinks.length * 1.99; // Each drink costs $1.99
        return total;
    }

    private void printReceipt() {
        System.out.println("******** RECEIPT ********");
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Total: $" + orderTotal);
    }

    public static void main(String[] args) {
        SliceOHeaven pizzeria = new SliceOHeaven();
        pizzeria.takeOrder("1001", "Pepperoni", new String[]{"Garlic Bread"}, new String[]{"Soda"});
    }
}