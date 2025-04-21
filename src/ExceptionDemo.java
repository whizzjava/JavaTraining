public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 42 ; //int r = 42 / a ;
        int r = 0;
        int arr[] = new int[] {1,2,3};
        int element_3=0;

        Division div = new Division();

        try {
            r = div.divide(a, b);
            element_3 = arr[2];

            if (a>10){
                System.out.println("Allow Withdriwal");

            }else{
                throw new MyException("Insufficent bank balance");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic ERROR : "+ e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR : "+ e.getMessage());
        } finally {
            System.out.println(" This will execute always");
        }

        System.out.println("Result = " + r);
        System.out.println("3rd array Element = " + element_3);

    }
}