public class Intersection {
    public static void main(String[] args) {
        int[] arr = new int[]{1,20,20,40,60};
        int[] brr = new int[]{2,20,20,20,40};
        System.out.println("The common elements are ");
        printIntersection(arr, brr);
    }

    public static void printIntersection(int[] arr, int[] brr) {
        int length1 = arr.length;
        int length2 = brr.length;

        int counter1 = 0;
        int counter2 = 0;

        while (counter1 < length1 && counter2 < length2) {
            if (counter1 > 0 && (arr[counter1] == arr[counter1 - 1])) {
                counter1++;
                continue;
            }

            if(arr[counter1] > brr[counter2]) {
                counter2++;
            } else if(arr[counter1] < brr[counter2]) {
                counter1++;
            } else {
                System.out.println(arr[counter1]);
                counter1++;
            }
        }
    }

}
