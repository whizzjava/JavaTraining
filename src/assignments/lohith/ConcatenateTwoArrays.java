package assignments.lohith;
import java.util.Arrays;

public class ConcatenateTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] result = new int[array1.length + array2.length];

        int index = 0;
        for (int num : array1) {
            result[index++] = num;
        }
        for (int num : array2) {
            result[index++] = num;
        }

        System.out.println(Arrays.toString(result));
    }
}