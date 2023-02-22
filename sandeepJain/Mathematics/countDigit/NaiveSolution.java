import java.util.*;
public class NaiveSolution {
    public static void main (String args[]) {
        System.out.println("Enter the number you want to count for digit");

        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();
        int tempNumber = number;

        int digitCount= 0;

        while (number != 0) {
            digitCount++;
            number /= 10;
        }
        System.out.println("The number of digit present in the number " + tempNumber + " is "+ digitCount);
    }
}
// Time complexity is 0(n)