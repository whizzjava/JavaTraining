abstract class Animall {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dogg extends Animall {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Woof Woof");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Dogg dog = new Dogg();
        dog.makeSound(); // Outputs: Woof Woof
        dog.eat();       // Outputs: This animal is eating.
    }
}
