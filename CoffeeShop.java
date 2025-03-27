import java.sql.SQLOutput;

public class CoffeeShop {
    // TODO 1: Change the class name to CoffeeShop

    public static void main(String[] args) {
        // TODO 2: Create three CoffeeOrder objects
        CoffeeOrder order1 = new CoffeeOrder();
        CoffeeOrder order2 = new CoffeeOrder("Jumbo");
        CoffeeOrder order3 = new CoffeeOrder("Shot", "expresso");

        // TODO 3: Call describeOrder() on each and print the result
        System.out.println(order1.describeOrder());
        System.out.println(order2.describeOrder());
        System.out.println(order3.describeOrder());

        // TODO 4: Print the total number of orders using
        System.out.println(CoffeeOrder.totalOrders);
    }
}
