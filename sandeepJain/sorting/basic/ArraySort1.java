import java.util.Arrays;

public class ArraySort1 {
    public static void main(String[] args) {
        String [] arr = new String[] {"a","k","l","j"};
        for(var x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(arr, (a,b) -> b.compareTo(a));
        for(var x : arr) {
            System.out.print(x+" ");
        }
    }
}
