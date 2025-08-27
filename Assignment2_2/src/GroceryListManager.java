import java.util.HashMap;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    // Add item with cost
    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }


    public void removeItem(String item) {
        groceryList.remove(item);
    }

    // Display all items with their costs
    public void displayList() {
        System.out.println("Grocery List:");
        int i = 1;
        for (String item : groceryList.keySet()) {
            System.out.println(i + ". " + item + " - $" + groceryList.get(item));
            i++;
        }
        System.out.println();
    }


    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    // Calculate total cost of all items
    public double calculateTotalCost() {
        double total = 0.0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add items with costs
        manager.addItem("Apples", 1.00);
        manager.addItem("Milk", 2.00);
        manager.addItem("Bread", 3.00);
        manager.addItem("Cheese", 5.00);
        manager.addItem("Chicken", 8.00);

        // Display list
        manager.displayList();


        System.out.println("Is \"Cheese\" in the grocery list? " + manager.checkItem("cheese"));
        System.out.println();

        // Calculate total cost
        System.out.println("Total cost of items: Euro" + manager.calculateTotalCost());
        System.out.println();


        System.out.println("Removing \"Cheese\"...");
        manager.removeItem("Cheese");


        System.out.println("Updated Grocery List:");
        manager.displayList();

        // Show updated total
        System.out.println("Updated total cost: Euro" + manager.calculateTotalCost());
    }
}
