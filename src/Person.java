public class Person {
    // Private data members
    private String name;
    private int age;
    Address location;


    Person(){
        System.out.println("constructor called");
    }
    Person(String name, int age){
        System.out.println("parameterized constructor called");
        this.name = name;
        this.age= age;
    }
    Person(String name, int age, Address loc){
        System.out.println("parameterized constructor called");
        this.name = name;
        this.age= age;
        this.location = loc;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
