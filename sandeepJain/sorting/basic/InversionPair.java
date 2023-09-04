import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InversionPair {
    public static void main(String[] args) {
        // Set set = new HashSet<>();
        // System.out.println(set.add(1));
        // System.out.println(set.add(2));
        // System.out.println(set.add(1));
        // System.out.println(set.size());
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] arr = new int[]{40,30,20,10,4};
        System.out.println(countInversionPair(arr));
    }

    public static int countInversionPair(int[] arr) {
        int size = arr.length;
        int result = 0;
        for(int i = 0; i < size-1; i++) {
            for(int j = i+1; j < size; j++) {
                if(arr[i] > arr[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
