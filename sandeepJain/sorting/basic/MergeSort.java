public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{27,11,25,29,13};
        System.out.println("Before sorting");
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
        mergeSortMethod(arr, 0, arr.length - 1);

        System.out.println();
        System.out.println("After sorting");

        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void mergeSortMethod(int []arr, int l, int r) {
        if(r > l) {
            int mid = l + (r-l) / 2;
            // System.out.println("Mid is " + mid);
            mergeSortMethod(arr, l, mid);
            mergeSortMethod(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        int sizeLeft = m - l + 1;
        int sizeRight = r - m;

        int count1 = 0;
        int count2 = 0;

        int left[] = new int[sizeLeft];
        int right[] = new int[sizeRight];

        for(int i = 0; i < sizeLeft; i++) {
            left[i] = arr[l+i];
        }

        for(int i = 0; i < sizeRight; i++) {
            right[i] = arr[m+1+i];
        }

        // for (int i : left) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        // for (int i : right) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();
        int index = l;
        while(count1 < sizeLeft && count2 < sizeRight) {
            if(left[count1] < right[count2]) {
                arr[index] = left[count1];
                count1++;
                index++;
            } else {
                arr[index] = right[count2];
                count2++;
                index++;
            }
        }

        while (count1 < sizeLeft) {
            arr[index] = left[count1];
            count1++;
            index++;
        }

        while (count1 < sizeLeft) {
            arr[index] = right[count2];
            count2++;
            index++;
        }
    }
}
