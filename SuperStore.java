// SuperStore Exercise: Access Modifiers & Object Modeling Focus

class Product {
    protected String name;
    // - A protected String field called name
    protected double price;
    // - A protected double field called price
    private final int productId = nextId;
    // - A private final int productId
    public static int nextId;
    // - A public static int nextId to help generate unique IDs

    /**
     * Constructor for the Product class, increments the static nextId varible to
     * ensure unique productId's
     * @param name sets the name of the product (String)
     * @param price sets the price of the product (double)
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.nextId++;
    }
    // - A constructor that sets name, price, and assigns a unique ID
    // - Public getters for all fields
    public String getName() {
        return this.name;
    }
    public double getPrice() {
        return this.price;
    }
    public int getProductId() {
        return this.productId;
    }
    public int getNextId() {
        return this.nextId;
    }

    /**
     * Overrides the built-in toString method
     * @return An easy to read, formatted String of all the information for the object
     */
    @Override
    public String toString() {
        return ("Product Name: " + this.name + "\nProduct Price: " + this.price +
                "\nProduct ID: " + this.productId);
    }
    // - Override toString() to return formatted product details

    /**
     * Overrides the built-in equals function
     * @param o is an object of any kind
     * @return returns true if the objects match in productID, name, and
     * if they come from the product class
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Product)) return false;

        Product newProduct = (Product)o;

        if (newProduct.name == this.name && newProduct.price == this.price) {
            return true;
        } else {
            return false;
        }
    }
    // - Override equals(Object o) to compare name and productId

}

class Electronics extends Product {
    // - Add a private String field called brand
    private String brand;
    // - Add a private boolean field called hasBattery
    private boolean hasBattery;
    // - Constructor takes all fields and uses super for shared ones

    /**
     * Constructor for the Electronics class
     * @param name name of product (String)
     * @param price price of product (double)
     * @param brand brand of the electronic (String)
     * @param hasBattery whether the electronic has a battery (boolean)
     */
    public Electronics(String name, double price, String brand, boolean hasBattery) {
        super(name, price);
        this.brand = brand;
        this.hasBattery = hasBattery;
    }
    /**
     * Overrides the toString method made in the product class
     * @return An easy to read, formatted String of all the information for the object
     */
    @Override
    public String toString() {
        return ("Product Name: " + this.name + "\nProduct Price: " + this.price +
                "\nProduct ID: " + super.getProductId() + "\nElectronic Brand: " + this.brand +
                "\nHas a Battery?: " + this.hasBattery);
    }
    // - Override toString() to include brand and battery status

    final public void warrantyInfo() {
        System.out.println("This product has a warranty");
    }
}

class Grocery extends Product {
    // - Add a private double field called weight (in kg)
    private double weight;
    // - Add a private boolean field called isPerishable
    private boolean isPerishable;
    // - Constructor takes all fields and uses super for shared ones
    public Grocery(String name, double price, double weight, boolean isPerishable) {
        super(name, price);
        this.weight = weight;
        this.isPerishable = isPerishable;
    }
    /**
     * Overrides the toString method made in the product class
     * @return An easy to read, formatted String of all the information for the object
     */
    @Override
    public String toString() {
        return ("Product Name: " + this.name + "\nProduct Price: " + this.price +
                "\nProduct ID: " + super.getProductId() + "\nGrocery Weight: " + this.weight +
                "\nIs Perishable?: " + this.isPerishable);
    }
    // - Override toString() to include weight and perishability
}

/**
 * Having extends Product in the class declaration allows the class to inherit certain traits from
 * the product class like name, price, and productId. It also allows the productId to increment
 * every time a new instance is created
 * We can do all of this because we are allowed to use the super keyword
 */
final class Toy extends Product{
    // - Add a private int field called minAge
    private int minAge;
    // - Constructor takes all fields and uses super for shared ones
    public Toy(String name, double price, int minAge) {
        super(name, price);
        this.minAge = minAge;
    }
    /**
     * Overrides the toString method made in the product class
     * @return An easy to read, formatted String of all the information for the object
     */
    @Override
    public String toString() {
        return ("Product Name: " + this.name + "\nProduct Price: " + this.price +
                "\nProduct ID: " + super.getProductId() + "\nMinimum Age: " + this.minAge);
    }
    // - Override toString() to include minAge
}

class Coupon {
    final double discountRate;
    double newProductPrice;

    public Coupon(double discountRate, Product p) {
        this.discountRate = discountRate;
        this.newProductPrice = p.price - (p.price * discountRate);
    }
}

class SuperStoreTest {
    public static void main(String[] args) {
        // - Create at least one instance of each subclass
        Product electronics = new Electronics("iPhone", 1000.00, "Apple", true);
        Product electronics2 = (Product)electronics;
        Grocery grocery = new Grocery("Banana", 5.00, 2.5, true);
        Toy toy = new Toy("Steve", 15.00, 8);
        // - Store them in a Product[] array
        Product[] productArray = {electronics, grocery, toy};
        // - Loop through and print each item
        for (int x = 0; x < productArray.length; x++) {
            System.out.println(productArray[x]);
        }
        // - Call equals() to compare two products with the same ID and name
        System.out.println(electronics2.equals(electronics));

        System.out.println("iPhone with discount: " + new Coupon(0.25, electronics).newProductPrice);
    }
}


// Additional TODOs:
// 1. Try to extend Toy — what happens and why?
// 2. Make a class Coupon with a final discountRate and apply it to a Product
// 3. Add a method to Electronics called warrantyInfo() and mark it final
// 4. Use access modifiers appropriately and explain your choices in comments
/**
 * The main reason I used the access modifiers that I used was because of what the ToDo comments told me
 * But the reason behind using certain access modifiers was based on accessibility:
 * I used private to make certain attributes only accessible inside their class and with getter/setter methods
 * but if an object has no getter or setter methods, that means that the private value cannot be retrieved or
 * changed outside the class, after an instance is made.
 * I used the public keyword if I wanted to make attribute accessibility and mutability easy to use outside the class,
 * also for calling functions at all outside of classes. You cannot call a private method outside of it's class
 */
