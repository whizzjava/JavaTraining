public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();


        p1.setName("harsha");
        p1.setAge(23);


        System.out.println("name of person : "+p1.getName());
        System.out.println("age of person : "+p1.getAge());

        Person p2 = new Person();


        p2.setName("lohit");
        p2.setAge(21);


        System.out.println("name of person : "+p2.getName());
        System.out.println("age of person : "+p2.getAge());

    }
}
