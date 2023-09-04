import java.util.Arrays;
import java.util.Comparator;

public class SortEvenOdd {
    public static void main(String[] args) {
        Integer [] arr = new Integer[] {1,4,2,3,5,9,6,8};
        Arrays.sort(arr,new MyComparator());

        for(var number : arr) {
            System.out.print(number +" ");
        }
        System.out.println();
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return a % 2 - b % 2;
    }
    
}
