public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {64,25,12,22,11};

        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for(int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }

            swap(arr, i, min);
        }

        for (var number : arr) {
            System.out.print(number + " ");
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
