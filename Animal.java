// Base class
// TODO: Define a class called Animal with:
public class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Generic sound");
    }

    public String toString() {
        return "Animal: " + name;
    }

    public boolean equals(Object o) {
        if (o.toString() == this.toString()) {
            return true;
        } else {
            return false;
        }
    }
}

class Mammal extends Animal {
    protected boolean warmBlooded = true;
    protected String dietType;
    protected int numLegs;
    protected String sound;

    public Mammal(String name) {
        super(name);
        this.dietType = "herbivore";
        this.numLegs = 4;
        this.sound = "growl";
    }

    public void speak() {
        System.out.println(name + ": " + sound);
    }

    public void performTrick() {
        System.out.println("cool trick");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
        this.dietType = "Omnivore";
        this.numLegs = 4;
        this.warmBlooded = true;
        this.sound = "Woof!";
    }

    public void speak() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Mammal {
    public Cat(String name) {
        super(name);
        this.dietType = "Carnivore";
        this.numLegs = 4;
        this.warmBlooded = true;
        this.sound = "Meow!";
    }

    public void speak() {
        System.out.println(name + " says: Meow!");
    }

    public boolean equals(Object o) {
        if (o.toString() == this.toString()) {
            return true;
        } else {
            return false;
        }
    }
}

class Human extends Mammal {
    public Human(String name) {
        super(name);
        this.dietType = "Omnivore";
        this.numLegs = 2;
        this.warmBlooded = true;
        this.sound = "Hello!";
    }
}

class Reptile extends Animal {
    boolean warmBlooded = false;
    int numLegs;
    String dietType;
    String sound;

    public Reptile(String name, Boolean warmBlooded, int numLegs, String dietType, String sound) {
        super(name);
        this.warmBlooded = warmBlooded;
        this.numLegs = numLegs;
        this.dietType = dietType;
        this.sound = sound;
    }

    public void speak() {
        System.out.println(name + ": " + sound);
    }
}

class Bird extends Animal { // doing extends human does not work, I get an error that says it cannot access human,
    // This is because the bird class would need at least all the same parameters that the
    // human class has

    public Bird(String name) {
        super(name);
    }

    public void speak() {
        System.out.println("bird noise");
    }

}

class Main {
    public class AnimalKingdomTest {

    }
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Whiskers");
        Animal downcastingTest = new Mammal("Name");
        Mammal downcastingTest2 = (Mammal)downcastingTest;

        a1.speak();
        a2.speak();

        System.out.println(a1);
        System.out.println(a2);
        a1.equals(new Dog("Buddy"));
    }
}



// Additional TODOs:
// 1. Create a new subclass of Animal (e.g., Bird) and override speak()
// 2. Try to extend Human – what happens and why?
// 3. Override equals() in Dog or Cat to also check the type
// 4. Add a method to Mammal called performTrick() and call it via downcasting
