public class ConstructorDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("john",25);

        Address a = new Address();

        Person p3 = new Person("carter",30,a);
    }
}
