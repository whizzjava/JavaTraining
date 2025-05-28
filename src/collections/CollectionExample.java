package collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding equals() to compare based on name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Overriding hashCode() to ensure proper hashing in collections
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Implementing compareTo() for sorting (age-based comparison)
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CollectionExample {
    public static void main(String[] args) {
        // Using HashSet (Relies on equals() and hashCode())
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(new Person("Alice", 25));
        personSet.add(new Person("Bob", 30));
        personSet.add(new Person("Alice", 32)); // Duplicate (ignored due to equals & hashCode)

        System.out.println("HashSet (Unique Objects): " + personSet);

        // Using TreeSet (Relies on compareTo())
        TreeSet<Person> sortedSet = new TreeSet<>();
        sortedSet.add(new Person("Bob", 30));
        sortedSet.add(new Person("Charlie", 22));
        sortedSet.add(new Person("Alice", 25));


        System.out.println("TreeSet (Sorted by Age): " + sortedSet);
    }
}
