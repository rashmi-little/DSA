// Merge two sorted subarray where low to mid is sorted and mid + 1 to high is sorted.
public class MergeSorted {
    public static void main(String[] args) {
        int[] arr = new int[] {10,15,20,11,30,45};
        int low = 0;
        int mid = 2;
        int high = 5;

        int[] left = new int[mid-low+1];
        int[] right = new int[high- mid];

        int index = 0;
        while(low <= mid) {
            left[index] = arr[low];
            low++;
            index++;
        }

        index = 0;
        while(mid+1 <= high) {
            right[index] = arr[mid+1];
            mid++;
            index++;
        }

        for (int i : left) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : right) {
            System.out.print(i + " ");
        }

        System.out.println();

        int a = 0;
        int b = 0;
        int index1 = 0;
        while(a < left.length && b < right.length) {
            if(left[a] <= right[b]) {
                arr[index1] = left[a];
                a++;
            } else {
                arr[index1] = right[b];
                b++;
            }
            index1++;
        }

        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
