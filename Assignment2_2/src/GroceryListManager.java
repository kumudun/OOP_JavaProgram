import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    // Add item to the list
    public void addItem(String item) {
        groceryList.add(item);
    }

    // Remove item from the list
    public void removeItem(String item) {
        groceryList.remove(item);
    }

    // Display all items in the list
    public void displayList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
        System.out.println();
    }

    // Check if an item exists in the list
    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        // Add some items
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");
        manager.addItem("Cheese");
        manager.addItem("Chicken");

        // Display the list
        manager.displayList();

        // Check if "Milk" is in the list
        System.out.println("Is \"Cheese\" in the grocery list? " + manager.checkItem("Milk"));
        System.out.println();

        // Remove "Milk" from the list
        System.out.println("Removing \"Cheese\" from the list...");
        manager.removeItem("Cheese");
        System.out.println();

        // Display updated list
        System.out.println("Updated Grocery List:");
        manager.displayList();
    }
}

