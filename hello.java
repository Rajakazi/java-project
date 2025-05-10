// Parent class
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child class that overrides the makeSound() method
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

// Another child class
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

// Main class to test the behavior
public class hello {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myDog = new Dog();       // Animal reference but Dog object
        Animal myCat = new Cat();       // Animal reference but Cat object

        myAnimal.makeSound(); // Outputs: The animal makes a sound
        myDog.makeSound();    // Outputs: The dog barks
        myCat.makeSound();    // Outputs: The cat meows
    }
}
