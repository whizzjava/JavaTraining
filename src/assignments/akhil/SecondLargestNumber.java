package assignments.akhil;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);// tried to get the array input from the user
        int[] numbers = {4, 8, 1, 2, 9, 3};
        int l = numbers.length;
        for (int j = 0; j < l; j++
        ) {
            for (int i = 0; i < l - 1; i++) {

                if (numbers[i] > numbers[j]) {
                    int x = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = x;


                }
            }

        }

//        for (int i = 0; i < l; i++) {
//            System.out.println(numbers[i]);//for looking at the output of the array
//
//        }

//
//        }
//        System.out.println(numbers.length);//checked whether length method works or not

        System.out.println("teh second largest number in the array is :"+ numbers[l-2] );

    }
}
