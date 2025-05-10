// Abstract class named Animal
abstract class Animal {
    
    // Abstract method: no body, must be implemented by subclasses
    abstract void animalSound();
    
    // Regular (concrete) method with a body
    public void sleep() {
        System.out.println("zkzak"); // prints "zkzak"
    }
}

// Subclass (inherits from Animal)
class Pig extends Animal {
    
    // Implementation of the abstract method
    public void animalSound() {
        System.out.println("The pig says: weee weee"); // prints pig sound
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();         // Create a Pig object
        myPig.animalSound();           // Call the abstract method (implemented in Pig)
        myPig.sleep();                 // Call the inherited method from Animal
    }
}
