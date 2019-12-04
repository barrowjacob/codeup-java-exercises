package Sand;

import java.util.Scanner;

public class Psvm extends GroceryItem {

    int totalNumberDifferentItems;

    public Psvm(String foodName, int quantityFood, String category) {
        super(foodName, quantityFood, category);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please tell me how many grocery items you'd like to enter: ");
        int totalNumberDifferentItems = sc.nextInt();
        GroceryItem[] itemArray = new GroceryItem[totalNumberDifferentItems];
        System.out.printf("Great! %s items", totalNumberDifferentItems);
        for (var i = 0; i < totalNumberDifferentItems; i++) {
            System.out.println("Tell me about the first item. \n Name: ");
            String itemName = sc.next();
            System.out.println("Quantity: ");
            int quantityOfItem = sc.nextInt();
            System.out.println("Category: ");
            String itemType = sc.next();
            GroceryItem newItem = new GroceryItem(itemName, quantityOfItem, itemType);
            itemArray[i] = newItem;
        } for (var j = 0; j < itemArray.length; j++) {
            System.out.println(itemArray[j].name);
        }

    }
}
