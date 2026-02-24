// Abstraction using abstract class
abstract class Animal {
    // Encapsulation (private variable)
    private String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Getter method (Encapsulation)
    public String getName() {
        return name;
    }

    // Abstract method (Abstraction)
    abstract void sound();
}

// Inheritance
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    // Polymorphism (Method overriding)
    @Override
    void sound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    // Polymorphism (Method overriding)
    @Override
    void sound() {
        System.out.println(getName() + " says: Meow!");
    }
}

// Main class
public class OOP {
    public static void main(String[] args) {

        // Object creation
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Kitty");

        // Runtime polymorphism
        a1.sound();
        a2.sound();
    }
}
