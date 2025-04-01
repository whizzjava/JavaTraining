public class InheritanceDemo {

    public static void main(String[] args) {
        Audi c1 = new Audi();

        c1.color = "red";
        c1.model = "q3";

        System.out.println("Price of Audi "+c1.model+"  "+c1.color+" is : "+c1.getPrice(100000)+"$");


        Audi c2 = new Audi();

        c2.color = "silver";
        c2.model = "q3";

        System.out.println("Price of Audi "+c2.model+"  "+c2.color+" is : "+c1.getPrice(90000)+"$");


        Car porsche = new Car( );

        porsche.color = "white";
        porsche.model = "Macan";

        System.out.println("Price of Porsche " +porsche.model+"  "+porsche.color+" is : "+porsche.getPrice(200000)+"$");




    }
}
