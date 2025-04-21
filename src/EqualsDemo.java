public class EqualsDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();



        e1.name = "akhil";
        e1.sal = 10000;


        e2.name = "akhil";
        e2.sal = 10000;

        if(e1.equals(e2)){
            System.out.println("MATCH");
        }else{
            System.out.println("NO MATCH");
        }


        Object obj;
    }
}
