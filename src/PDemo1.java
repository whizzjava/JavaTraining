class Calculator {
    public int add(int a, int b) {
        System.out.println("2 params");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("2 params dou");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("3 params");
        return a + b + c;
    }
}

public class PDemo1 { // compile time polymorphism

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println("memory addr 1:"+cal);

        System.out.println("Result 1: "+cal.add(5,2));

        System.out.println("Result 2: "+cal.add(5,2,3));

        System.out.println("Result 3: "+cal.add(15.2,2.8));
    }
}
