import java.util.*;
public class FibbonacciRecursive {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int index = scanner.nextInt();

            System.out.println("The fibbo value of the " + index + " is "+FibboValue(index));
    }
    public static int FibboValue(int index) {
        if(index == 0 || index == 1) {
            return index;
        }
        else
        return FibboValue(index - 1)+FibboValue(index -2);
    }
}
