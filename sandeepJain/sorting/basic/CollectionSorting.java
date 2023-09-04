import java.util.*;

public class CollectionSorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(11);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(5);

        Collections.sort(list, Collections.reverseOrder());
        for (var number : list) {
            System.out.print(number +" ");
        }
    }
}
