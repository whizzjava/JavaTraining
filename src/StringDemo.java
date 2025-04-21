public class StringDemo {
    public static void main(String[] args) {


        String course_name ="java_fse";

        //course_name = "hello";

        String xyz = "java_fse";


        System.out.println("print - "+course_name);

        System.out.println("print length - "+course_name.length());
        System.out.println("print CAPITAL - "+course_name.toUpperCase());

        System.out.println("print index - "+course_name.charAt(4));

        System.out.println("print substring - "+course_name.substring(0,4).toUpperCase());


        String str1 = "akhil";
        String str2 = "akhil";


        if(str1.equals(str2)){
            System.out.println("MATCH");
        }else{
            System.out.println("NO MATCH");
        }


    }
}
