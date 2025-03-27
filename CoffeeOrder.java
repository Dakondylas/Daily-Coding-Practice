public class CoffeeOrder {
    // TODO 1: Change the class name to CoffeeOrder

    // TODO 2: Create instance variables:
    String size;
    String type;
    private String orderId;

    // TODO 3: Add a static int variable called totalOrders
    static int totalOrders = 0;

    // TODO 4: Create a no-arg constructor
    CoffeeOrder() {
        this.size = "medium";
        this.type = "black";
        totalOrders++;
    }

    // TODO 5: Create a constructor that takes a size only
    CoffeeOrder(String size) {
        this.size = size;
        this.type = "black";
        totalOrders++;
    }

    // TODO 6: Create a constructor that takes size and type
    CoffeeOrder(String size, String type) {
        this.size = size;
        this.type = type;
        totalOrders++;
    }

    // TODO 7: Create a method describeOrder() that returns
    String describeOrder() {
        return ("Order: " + this.size + " " + this.type);
    }

    // TODO 8: Add a static method getTotalOrders() to return totalOrders
    static int getTotalOrders() {
        return totalOrders;
    }
}
