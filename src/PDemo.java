// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Subclass
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Subclass
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Usage
public class PDemo {// run time polymorphism
    public static void main(String[] args) {
        Animal animal = new Animal(); // Generic animal
        animal.makeSound(); // Output: Generic animal sound

        Animal dog = new Dog(); // Polymorphic: Dog object treated as Animal
        dog.makeSound(); // Output: Woof!

        Animal cat = new Cat(); // Polymorphic: Cat object treated as Animal
        cat.makeSound(); // Output: Meow!
    }
}