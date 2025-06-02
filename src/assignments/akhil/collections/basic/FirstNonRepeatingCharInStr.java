package assignments.akhil.collections.basic;

import java.util.Scanner;

public class FirstNonRepeatingCharInStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the input for which you would like to see teh first non repeating character: ");
        String s =sc.next();
//        String s="swiss";
        char[] c=s.toCharArray();
//        System.out.println(c[0]);
        int l=c.length;

        String norepeat="";
         for (int i = 0; i <l ; i++) {
             int count=0;
             for (int j = 0; j < l; j++) {


                 if (c[i] == c[j] && i!=j) {
                     count++;

                 }

             }
//             System.out.println(count);
             if(count==0){
                 norepeat +=c[i];
//                 System.out.println(norepeat);

             }

        }
        System.out.println("teh first non repeating character in the given string is : "+norepeat.toCharArray()[0]);
    }
}
