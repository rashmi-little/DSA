import java.util.Arrays;

public class SortSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{4,6,2,4,2,3,1,4,2,3,5,2};
        // Arrays.sort(arr);

        // for (var number : arr) {
        //     System.out.print(number + " ");
        // }

        System.out.println();
        Arrays.sort(arr,5,9);

        for (var number : arr) {
            System.out.print(number + " ");
        }
    }
}
